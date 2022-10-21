package projects;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int base;
        int newBase;
        String number;
        List<String> newNumber = new LinkedList<>();
        System.out.println("Input a starting base");
        base = new Scanner(System.in).nextInt();
        System.out.println("Input a new base");
        newBase = new Scanner(System.in).nextInt();
        System.out.println("Input a number to be converted");
        number = new Scanner(System.in).next();
        System.out.println("The new number is: ");
        if (base == 10) {
            do {
                newNumber.add(String.valueOf(Integer.parseInt(number)%newBase));
                number = String.valueOf(Integer.parseInt(number)/newBase);
            } while (Integer.parseInt(number) > 0);
            for (int i = 1; i <= newNumber.size(); i++) {
                System.out.print(newNumber.get(newNumber.size()-i));
            }
        } else {
            List<String> value = new ArrayList<>(Arrays.asList(number.split("")));
            int newValue = 0;
            int m = value.size()-1;
            do {
                System.out.println(value.get(m));
                newNumber.add(String.valueOf(Integer.parseInt(value.get(m))*Math.pow(newBase, m)));
                m--;
            } while (m > 0);
            for (String s : newNumber) {
                System.out.println(s);
                newValue += Integer.parseInt(s);
            }
            if (newBase == 10) {
                for (int i = 1; i <= newNumber.size(); i++) {
                    System.out.print(newNumber.get(newNumber.size()-i));
                }
            } else {
                do {
                    newNumber.add(String.valueOf(Integer.parseInt(number)%newBase));
                    number = String.valueOf(Integer.parseInt(number)/newBase);
                } while (Integer.parseInt(number) > 0);
                for (int i = 1; i <= newNumber.size(); i++) {
                    System.out.print(newNumber.get(newNumber.size()-i));
                }
            }
        }
    }

    public void baseto10(String number, int base) {

    }
}
