package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
import hexlet.code.Constant;

public class Progression {
    public static void play() {
        String name = Cli.greet();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Constant.COUNT; i++) {
            Random random = new Random();
            int number = random.nextInt(Constant.RANGE_1);
            int difference = random.nextInt(Constant.RANGE_2);
            int pointer = random.nextInt(Constant.LENGTH_PROGRESSION);
            System.out.print("Question:");
            String correctAnswer = getCorrectAnswer(number, difference, pointer, Constant.LENGTH_PROGRESSION);
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
