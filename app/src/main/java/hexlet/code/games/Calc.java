package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
import hexlet.code.Constant;

public class Calc {
    public static void play() {
        final String description = "What is the result of the expression?";
        String[][] data = new String[Constant.COUNT][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number1 = random.nextInt(Constant.RANGE_1);
            int number2 = random.nextInt(Constant.RANGE_1);
            int pointerToTheOperation = random.nextInt(Constant.COUNT);
            String operation;
            if (pointerToTheOperation == 0) {
                operation = "+";
            } else if (pointerToTheOperation == 1) {
                operation = "-";
            } else {
                operation = "*";
            }
            data[i][0] = " " + number1 + " " + operation + " " + number2;
            data[i][1] = getCorrectAnswer(operation, number1, number2);
        }
        Engine.checkTheCorrectness(data, description);
    }

    public static String getCorrectAnswer(String operation, int number1, int number2) {
        String correctAnswer;
        if (operation.equals("+")) {
            correctAnswer = String.valueOf(number1 + number2);
        } else if (operation.equals("-")) {
            correctAnswer = String.valueOf(number1 - number2);
        } else {
            correctAnswer = String.valueOf(number1 * number2);
        }
        return correctAnswer;
    }
}
