import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
	private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    // Load questions from a file
    public void loadQuestions(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String questionText = line;
                List<String> options = new ArrayList<>();
                for (int i = 0; i < 4; i++) {  // Read 4 options
                    options.add(br.readLine());
                }
                int correctAnswer = Integer.parseInt(br.readLine());  // Read correct answer
                questions.add(new Question(questionText, options, correctAnswer));
                br.readLine();  // Read empty line between questions
            }
        } catch (IOException e) {
            System.out.println("Error loading questions: " + e.getMessage());
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer the following questions:");
        LocalTime startTime = LocalTime.now();

        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == q.getCorrectAnswer()) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer is: " + q.getCorrectAnswer() + "\n");
            }
        }
        LocalTime endTime = LocalTime.now();
        Duration duration = Duration.between(startTime,endTime);

       System.out.print("Total Time Taken : " + "Minutes : " + duration.toMinutes() + " Seconds: " + duration.getSeconds() + "              Your Final Score: " + score + "/" + questions.size());
       System.out.println();
       System.out.println();
    }
}
