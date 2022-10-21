package projects;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Addition addition = new Addition(3.0, 4.5);
        Subtraction subtraction = new Subtraction(3.0, 1.5);
        Division division = new Division(4.0, 2.0);
        calculator.calculate(addition);
        calculator.calculate(subtraction);
        calculator.calculate(division);
    }
}
