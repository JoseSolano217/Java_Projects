package projects;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            choice = keyboard.nextInt();
        } while (choice < 1 || choice > 3);
    }
}
