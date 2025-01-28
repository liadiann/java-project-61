package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void play() {
        String name = Cli.greet();
        System.out.println("What number is missing in the progression?");
        final int length = 10;
        final int countOfTry = 3;
        final int rangeForNumber = 100;
        final int rangeForDifference = 30;
        final int countOfElements = 10;
        for (int i = 0; i < countOfTry; i++) {
            Random random = new Random();
            int number = random.nextInt(rangeForNumber);
            int difference = random.nextInt(rangeForDifference);
            int pointer = random.nextInt(countOfElements);
            System.out.print("Question:");
            String correctAnswer = getCorrectAnswer(number, difference, pointer, length);
            boolean check = Engine.checkTheCorrectness(correctAnswer, name, i);
            if (!check) {
                break;
            }
        }
    }

    public static String getCorrectAnswer(int firstNumber, int difference, int pointer, int length) {
        String correctAnswer = "";
        for (int i = 0; i < length; i++) {
            int number = firstNumber + i * difference;
            if (i == pointer) {
                correctAnswer = String.valueOf(number);
                System.out.print(" ..");
                continue;
            }
            System.out.print(" " + number);
        }
        System.out.print("\n");
        return correctAnswer;
    }
}
