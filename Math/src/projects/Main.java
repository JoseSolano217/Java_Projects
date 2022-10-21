package projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int prefix = 1;
        System.out.println("Power of?");
        int p = new Scanner(System.in).nextInt();
        while (p != 1) {
            System.out.println("Cycle start");
            if (p % 2 == 0) {
                x = x*x;
            } else {
                prefix = prefix * x;
                x = x * x;
            }
            p = p/2;
            System.out.println("Cycle end");
        }
        System.out.println(x * prefix);
    }
}
