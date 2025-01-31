package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""");
        System.out.print("Your choice: ");
        String choice = sc.next();
        switch (choice) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.play();
                break;
            case "3":
                Calc.play();
                break;
            case "4":
                GCD.play();
                break;
            case "5":
                Progression.play();
                break;
            case "6":
                Prime.play();
                break;
            case "0":
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
