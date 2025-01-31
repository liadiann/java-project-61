package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
import hexlet.code.Constant;

public class Even {
    public static void play() {
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] data = new String[Engine.COUNT_OF_ROUNDS][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            Random random = new Random();
            int number = random.nextInt(Constant.RANGE_1);
            data[i][0] = " " + number;
            if (number % 2 == 0) {
                data[i][1] = "yes";
            } else {
                data[i][1] = "no";
            }
        }
        Engine.checkTheCorrectness(data, description);
    }
}
