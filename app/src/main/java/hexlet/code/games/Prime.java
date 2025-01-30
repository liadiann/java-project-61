package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import hexlet.code.Constant;

public class Prime {
    public static void play(String name) {
        String[][] data = new String[Constant.COUNT][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number = random.nextInt(Constant.RANGE_1);
            data[i][0] = String.valueOf(number);
            data[i][1] = getCorrectAnswer(number);
        }
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.checkTheCorrectness(data, name);
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
