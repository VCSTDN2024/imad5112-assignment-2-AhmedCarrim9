package com.example.flashcardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela was the president in 1994",
        "The apartheid system officialy began in 1948",
        "South Africa's first democratic elections were held in 1990",
        "The African National Congress (ANC) was founded in 1912",
        "South Africa hosted the FIFA World Cup in 2006"
    )

    private val answers = booleanArrayOf(true, true, false, true, false)
    private var currentQuestionIndex = 0
    private var score = 0

    private lateinit var questionTextView: TextView
    private lateinit var feedbackTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        questionTextView = findViewById(R.id.questionTextView)
        feedbackTextView = findViewById(R.id.feedbackTextView)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        nextButton = findViewById(R.id.nextButton)

        displayQuestion()

        trueButton.setOnClickListener {
            checkAnswer(true)
        }

        falseButton.setOnClickListener {
            checkAnswer(false)
        }

        nextButton.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                displayQuestion()
                feedbackTextView.text = ""
                trueButton.isEnabled = true
                falseButton.isEnabled = true
            } else {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL_QUESTIONS", questions.size)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun displayQuestion() {
        questionTextView.text = questions[currentQuestionIndex]
        questionTextView.post {
            questionTextView.text = questions[currentQuestionIndex]
        }
        nextButton.isEnabled = false
        feedbackTextView.visibility = View.INVISIBLE
    }

    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentQuestionIndex]

        feedbackTextView.visibility = View.VISIBLE

        if (userAnswer == correctAnswer) {
            feedbackTextView.text = getString(R.string.correct)
            feedbackTextView.setTextColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
            score++
        } else {
            feedbackTextView.text = getString(R.string.incorrect)
            feedbackTextView.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
        }

        trueButton.isEnabled = false
        falseButton.isEnabled = false
        nextButton.isEnabled = true
    }
}