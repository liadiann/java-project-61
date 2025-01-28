package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void play() {
        String name = Cli.greet();
        System.out.println("What number is missing in the progression?");
        int length = 10;
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int number = random.nextInt(100);
            int difference = random.nextInt(30);
            int pointer = random.nextInt(10);
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
