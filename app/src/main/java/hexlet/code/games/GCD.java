package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;
import java.util.Random;
import hexlet.code.Constant;

public class GCD {
    public static void play() {
        String name = Cli.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number1 = random.nextInt(Constant.RANGE_1);
            int number2 = random.nextInt(Constant.RANGE_2);
            System.out.println("Question: " + number1 + " " + number2);
            String correctAnswer = getCorrectAnswer(number1, number2);
            boolean check = Engine.checkTheCorrectness(correctAnswer, name, i);
            if (!check) {
                break;
            }
        }
    }

    public static String getCorrectAnswer(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return String.valueOf(number1);
    }
}
