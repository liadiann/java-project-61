package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import hexlet.code.Constant;

public class Progression {
    public static void play() {
        final String description = "What number is missing in the progression?";
        String[][] data = new String[Constant.COUNT][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number = random.nextInt(Constant.RANGE_1);
            int difference = random.nextInt(Constant.RANGE_2);
            int pointer = random.nextInt(Constant.LENGTH_PROGRESSION);
            getCorrectAnswer(number, difference, pointer, Constant.LENGTH_PROGRESSION, data, i);
        }
        Engine.checkTheCorrectness(data, description);
    }

    public static void getCorrectAnswer(int firstNumber, int diff, int pointer, int length, String[][] data, int ind) {
        var result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = firstNumber + i * diff;
            if (i == pointer) {
                data[ind][1] = String.valueOf(number);
                result.append(" ..");
                continue;
            }
            String tmp = " " + number;
            result.append(tmp);
        }
        data[ind][0] = result.toString();
    }
}
