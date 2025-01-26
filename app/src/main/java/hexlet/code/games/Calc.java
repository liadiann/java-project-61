package hexlet.code.games;

import java.util.Random;
import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    public static void play() {
        String name = Cli.greet();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int pointerToTheOperation = random.nextInt(3);
            String operation;
            if (pointerToTheOperation == 0) {
                operation = "+";
            } else if (pointerToTheOperation == 1) {
                operation = "-";
            } else {
                operation = "*";
            }
            System.out.println("Question: " + number1 + " " + operation + " " + number2);
            String correctAnswer = getCorrectAnswer(operation, number1, number2);
            boolean check = Engine.checkTheCorrectness(correctAnswer, name, i);
            if (!check) {
                break;
            }
        }
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
