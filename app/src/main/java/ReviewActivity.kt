package com.example.flashcardapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView

class ReviewActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela was the president in 1994",
        "The apartheid system officialy began in 1948",
        "South Africa's first democratic elections were held in 1990",
        "The African National Congress (ANC) was founded in 1912",
        "South Africa hosted the FIFA World Cup in 2006"
    )

    private val answers = booleanArrayOf(true, true, false, true, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val reviewContainer = findViewById<LinearLayout>(R.id.reviewContainer)

        for (i in questions.indices) {
            val questionView = TextView(this)
            questionView.text = "${i + 1}. ${questions[i]}"
            questionView.textSize = 18f
            questionView.setPadding(0, 16, 0, 8)

            val answerView = TextView(this)
            answerView.text = "Correct answer: ${if (answers[i]) "True" else "False"}"
            answerView.textSize = 16f
            answerView.setPadding(0, 0, 0, 32)

            reviewContainer.addView(questionView)
            reviewContainer.addView(answerView)
        }
    }
}