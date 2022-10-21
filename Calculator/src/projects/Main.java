package projects;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = menu();
        switch (option) {
            case 1 -> sum();
            case 2 -> sub();
            case 3 -> mul();
            case 4 -> div();
            default -> System.out.println("No");
        }
    }

    public static int menu() {
        System.out.println("Select an operation");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division""");
        int choice = keyboard.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Input an integer value between 1 and 5");
            choice = keyboard.nextInt();
        }
        return choice;
    }

    public static void sum() {
        double num1 = 0;
        double num2 = 0;
        boolean check = false;
        System.out.println("Input two numbers to add");
        Scanner keyboard = new Scanner(System.in);
            try {
                num1 = keyboard.nextInt();
                num2 = keyboard.nextInt();
                check = true;
            } catch (NumberFormatException e) {
                System.err.println("The format used is incorrect");
            } catch (InputMismatchException e) {
                System.err.println("The data must be a number");
            }
            try {
                File file = new File("C:/Users/USUARIO/Documents/sum.txt");
                FileWriter file2 = new FileWriter(file, true);
                BufferedWriter data = new BufferedWriter(file2);
                if (check) {
                    data.write((num1 + num2) + "\n");
                    data.close();
                    System.out.println("The result is " + (num1 + num2));
                } else {
                    data.write("Error\n");
                    data.close();
                    System.out.println("Saved as an error");
                }
            } catch (FileNotFoundException e) {
                System.err.println("There is no file such as sum.txt");
            } catch (IOException e) {
                System.err.println("Data could not be saved because no");
            }
    }

    public static void sub() {
        double num1 = 0;
        double num2 = 0;
        boolean check = false;
        System.out.println("Input two numbers to subtract");
        Scanner keyboard = new Scanner(System.in);
        try {
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
            check = true;
        } catch (NumberFormatException e) {
            System.err.println("The format used is incorrect");
        } catch (InputMismatchException e) {
            System.err.println("The data must be a number");
        }
        try {
            File file = new File("C:/Users/USUARIO/Documents/sub.txt");
            FileWriter file2 = new FileWriter(file, true);
            BufferedWriter data = new BufferedWriter(file2);
            if (check) {
                data.write((num1 - num2) + "\n");
                data.close();
                System.out.println("The result is " + (num1 - num2));
            } else {
                data.write("Error\n");
                data.close();
                System.out.println("Saved as an error");
            }
        } catch (FileNotFoundException e) {
            System.err.println("There is no file such as sub.txt");
        } catch (IOException e) {
            System.err.println("Data could not be saved because no");
        }
    }

    public static void mul() {
        double num1 = 0;
        double num2 = 0;
        boolean check = false;
        System.out.println("Input two numbers to multiply");
        Scanner keyboard = new Scanner(System.in);
        try {
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
            check = true;
        } catch (NumberFormatException e) {
            System.err.println("The format used is incorrect");
        } catch (InputMismatchException e) {
            System.err.println("The data must be a number");
        }
        try {
            File file = new File("C:/Users/USUARIO/Documents/mul.txt");
            FileWriter file2 = new FileWriter(file, true);
            BufferedWriter data = new BufferedWriter(file2);
            if (check) {
                data.write((num1 * num2) + "\n");
                data.close();
                System.out.println("The result is " + (num1 * num2));
            } else {
                data.write("Error\n");
                data.close();
                System.out.println("Saved as an error");
            }
        } catch (FileNotFoundException e) {
            System.err.println("There is no file such as mul.txt");
        } catch (IOException e) {
            System.err.println("Data could not be saved because no");
        }
    }

    public static void div() {
        int num1 = 0;
        int num2 = 0;
        boolean check = false;
        System.out.println("Input two numbers to divide");
        Scanner keyboard = new Scanner(System.in);
        try {
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();
            check = true;
        } catch (NumberFormatException e) {
            System.err.println("The format used is incorrect");
        } catch (InputMismatchException e) {
            System.err.println("The data must be a number");
        }
        try {
            File file = new File("C:/Users/USUARIO/Documents/div.txt");
            FileWriter file2 = new FileWriter(file, true);
            BufferedWriter data = new BufferedWriter(file2);
            if (check) {
                    data.write((num1 / num2) + "\n");
                    data.close();
                    System.out.println("The result is " + (num1 / num2));
            } else {
                data.write("Error\n");
                data.close();
                System.out.println("Saved as an error");
            }
        } catch (FileNotFoundException e) {
            System.err.println("There is no file such as div.txt");
        }
        catch (ArithmeticException e) {
            System.err.println("Arithmetic error, check if you are dividing by zero");
        }
        catch (IOException e) {
            System.err.println("Data could not be saved because no");
        }
    }
}
