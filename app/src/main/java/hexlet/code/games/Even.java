package hexlet.code.games;

import java.util.Random;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Constant;

public class Even {
    public static void play() {
        String name = Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number = random.nextInt(Constant.RANGE_1);
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
