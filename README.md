# Quiz Competition

## Overview

The Quiz Competition is a Java-based console application that allows users to participate in quizzes on various programming languages, including Java, Python, JavaScript, and MySQL. The application dynamically reads quiz questions from text files, calculates the user's final score, and tracks the total time taken.

## Features

- Supports multiple quiz categories (Java, Python, JavaScript, MySQL)
- Dynamically loads questions from external text files
- Validates user input to prevent errors
- Tracks and displays total time taken to complete the quiz
- Shows correct and incorrect answers at the end

## Technologies Used

- Java - Core programming language
- File Handling - BufferedReader, FileReader for reading question files
- Collections Framework - ArrayList for storing questions
- Time Management - LocalTime, Duration for tracking quiz duration

## Project Structure

```
QuizJavaConsoleProject/
│── src/
│   ├── Main.java          # Entry point of the application
│   ├── Quiz.java          # Handles quiz logic and user interaction
│   ├── Question.java      # Defines question structure and answer validation
│   ├── QuestionBank/      # Stores text files with quiz questions
│   │   ├── JavaQuestions.txt
│   │   ├── PythonQuestions.txt
│   │   ├── JavaScriptQuestions.txt
│   │   ├── MySQLQuestions.txt
```

## Setup and Execution

### Prerequisites

- JDK 21 (or later)
- Any Java IDE (Eclipse, IntelliJ IDEA) or command-line compiler

### Steps to Run

1. Clone the repository or download the source code.
2. Open the project in your Java IDE or navigate to the project folder.
3. Compile and run the `Main.java` file.
4. Follow on-screen instructions to select a quiz category and answer questions.

## Formatting Question Files

Each quiz file should follow this format:

```
[Question]
[Option 1]
[Option 2]
[Option 3]
[Option 4]
[Correct Answer (1-4)]
[Empty Line]
```

### Example:

```
What is JVM?
A. Java Virtual Machine
B. JavaScript Virtual Machine
C. Java Variable Method
D. Java Volatile Memory
1

Which keyword is used to define a constant in Java?
A. final
B. static
C. constant
D. var
1
```

## Storing Question Files in GitHub

The `QuestionBank/` directory contains quiz question files, which are safe to include in the GitHub repository since they do not contain any confidential or sensitive information. Users can modify or extend these files to add more questions.

## Future Enhancements

- Implement a graphical user interface (GUI) using JavaFX
- Introduce a leaderboard system to track top scores
- Store quiz results in a database for user progress tracking
- Expand quiz categories with more programming topics

## License

This project is open-source and available for modification and distribution.


