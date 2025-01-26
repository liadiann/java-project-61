package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static boolean checkTheCorrectness(String correctAnswer, String name, int countOfIteration) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your answer: ");
        String answer = sc.next();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;
        }
        if (countOfIteration == 2) {
            System.out.println("Congratulations, " + name + "!");
        }
        return true;
    }
}
