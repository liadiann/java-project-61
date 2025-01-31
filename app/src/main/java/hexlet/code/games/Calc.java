package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
import hexlet.code.Constant;

public class Calc {
    public static void play() {
        final String description = "What is the result of the expression?";
        final int countOfOperations = 3;
        String[][] data = new String[Engine.COUNT_OF_ROUNDS][Constant.COUNT_OF_ELEMENTS_IN_PAIR];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            Random random = new Random();
            int number1 = random.nextInt(Constant.RANGE_1);
            int number2 = random.nextInt(Constant.RANGE_1);
            String[] operation = {"+", "-", "*"};
            int indexToTheOperation = random.nextInt(countOfOperations);
            data[i][0] = " " + number1 + " " + operation[indexToTheOperation] + " " + number2;
            data[i][1] = getCorrectAnswer(operation[indexToTheOperation], number1, number2);
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
