package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import hexlet.code.Constant;

public class GCD {
    public static void play(String name) {
        String[][] data = new String[Constant.COUNT][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number1 = random.nextInt(Constant.RANGE_1);
            int number2 = random.nextInt(Constant.RANGE_2);
            data[i][0] = " " + number1 + " " + number2;
            data[i][1] = getCorrectAnswer(number1, number2);
        }
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.checkTheCorrectness(data, name);
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
