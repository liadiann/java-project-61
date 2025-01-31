package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void checkTheCorrectness(String[][] data, String description) {
        String name = Cli.greet();
        System.out.println(description);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Constant.COUNT; i++) {
            System.out.println("Question:" + data[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (answer.equals(data[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
