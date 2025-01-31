package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import hexlet.code.Constant;

public class Prime {
    public static void play() {
        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] data = new String[Engine.COUNT_OF_ROUNDS][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            Random random = new Random();
            int number = random.nextInt(Constant.RANGE_1);
            data[i][0] = " " + number;
            data[i][1] = getCorrectAnswer(number);
        }
        Engine.checkTheCorrectness(data, description);
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
