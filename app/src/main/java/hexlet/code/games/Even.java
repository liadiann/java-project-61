package hexlet.code.games;

import java.util.Random;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void play() {
        String name = Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int countOfTry = 3;
        final int range = 100;
        for (int i = 0; i < countOfTry; i++) {
            Random random = new Random();
            int number = random.nextInt(range);
            System.out.println("Question: " + number);
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            boolean check = Engine.checkTheCorrectness(correctAnswer, name, i);
            if (!check) {
                break;
            }
        }
    }
}
