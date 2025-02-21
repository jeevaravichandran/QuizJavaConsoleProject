import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        while(true){
	            System.out.println("Welcome to the quiz competition! Choose the language below ");
	            System.out.println("1.Java");
	            System.out.println("2.Python");
	            System.out.println("3.JavaScript");
	            System.out.println("4.MySQL");
	            System.out.println("5.Exit");
	            int userChoice = scan.nextInt();
	            switch(userChoice){
	                case 1:
	                    Quiz quizJava = new Quiz();
	                    quizJava.loadQuestions("src/QuestionBank/JavaQuestions.txt");  // Load questions from file
	                    quizJava.start();
	                    break;
	                case 2:
	                    Quiz quizPython = new Quiz();
	                    quizPython.loadQuestions("src/QuestionBank/PythonQuestions.txt");  // Load questions from file
	                    quizPython.start();
	                    break;
	                case 3:
	                    Quiz quizJs = new Quiz();
	                    quizJs.loadQuestions("src/QuestionBank/JavaScriptQuestions.txt");
	                    quizJs.start();
	                    break;
	                case 4:
	                    Quiz quizSql = new Quiz();
	                    quizSql.loadQuestions("src/QuestionBank/MySQLQuestions.txt");
	                    quizSql.start();
	                    break;
	                case 5:
	                	scan.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Choose the available technology only");

	            }
	        }

	}

}
