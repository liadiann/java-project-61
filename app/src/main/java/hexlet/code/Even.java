package hexlet.code;

import java.util.Scanner;
import java.util.Random;

class Even {
    public static void play() {
        String name = Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            Random random = new Random();
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (i == 3) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
        sc.close();
    }
}
