package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void play() {
        String name = Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            String correctAnswer = getCorrectAnswer(number);
            boolean check = Engine.checkTheCorrectness(correctAnswer, name, i);
            if (!check) {
                break;
            }
        }
    }

    public static String getCorrectAnswer(int number) {
        String correctAnswer = "";
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                correctAnswer = "no";
                return correctAnswer;
            }
        }
        correctAnswer = "yes";
        return correctAnswer;
    }
}
