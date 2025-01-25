package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
        String choice = sc.next();
        switch (choice) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.play();
                break;
            case "0":
                break;
            default:
                System.out.println("Incorrect input");
        }
        sc.close();
    }
}
