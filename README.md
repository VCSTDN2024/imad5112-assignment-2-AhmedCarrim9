ST10479941 IMAD5112 Formative Assignment 2
Link to GitHub repository: https://github.com/VCSTDN2024/imad5112-assignment-2-AhmedCarrim9.git
Link to YouTube video: https://youtu.be/xdWjJxf2Upg

MealSuggestion App: Comprehensive and Detailed Report

1. Introduction

1. Introduction
The South African History Flashcard App is a native Android application developed using Kotlin and XML in Android Studio. Designed as an educational tool, it presents users with true/false questions about key historical events, providing immediate feedback and a final score summary. The app leverages GitHub for version control and GitHub Actions for automated testing, ensuring code reliability throughout development.


2. The application's goal
Problem Description:
Many learners struggle to retain historical facts through passive study methods. This app addresses that by offering an interactive quiz format to reinforce knowledge.
Objectives:
•	Test users’ knowledge of South African history via true/false questions.
•	Provide instant feedback to enhance learning.
•	Track scores and allow answer review for self-assessment.
•	Maintain code integrity through GitHub’s version control and automated workflows.

3. Design Factors
3.1 User Interface (UI) and Experience (UX)
Component	Functionality
Question TextView	Displays historical questions (e.g., "Nelson Mandela was imprisoned for 27 years")
True/False Buttons	Captures user responses
Feedback TextView	Shows colored feedback (green/red)
Review Screen	Lists all questions with correct answers
Key UX Features:
•	Minimalist design to reduce cognitive load.
•	Large, readable text for accessibility.

3.2 Logic of Application
The app uses arrays and conditionals to manage quiz flow

3.3 Input Validation and Error Handling
•	Case Insensitivity: Inputs like "TRUE" or "false" are normalized.
•	Question Bounds: Prevents index errors when navigating questions.
•	Feedback System: Uses Toast for invalid inputs (though all interactions are button-based).

4. GitHub and GitHub Actions
GitHub for Version Control
•	Branching: Separate branches for features (e.g., quiz-logic, ui-enhancements).
•	Commit Hygiene: Descriptive messages like "Fix score calculation bug".
GitHub Actions Automation
Workflow	Function
android-build.yml	Ensures the app compiles without errors.
lint-check.yml	Validates Kotlin code style.
unit-tests.yml	Runs JUnit tests on quiz logic.

5. In conclusion

5. Conclusion
The Flashcard App successfully delivers an engaging learning tool for South African history, combining intuitive design with robust functionality. Key achievements include:
•	Effective use of Kotlin for quiz logic and state management.
•	Seamless integration with GitHub for collaborative development.
•	Scalable architecture for future question expansions.
Future Directions:
•	Add multimedia (images/audio) to questions.
•	Implement user profiles to track progress over time.
        









