package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
import hexlet.code.Constant;

public class Even {
    public static void play(String name) {
        String[][] data = new String[Constant.COUNT][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number = random.nextInt(Constant.RANGE_1);
            data[i][0] = " " + number;
            if (number % 2 == 0) {
                data[i][1] = "yes";
            } else {
                data[i][1] = "no";
            }
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.checkTheCorrectness(data, name);
    }
}
