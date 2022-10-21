package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stat[] stats = new Stat[] {
                new Stat("HP", 0),
                new Stat("Attack", 0),
                new Stat("Defense", 0),
                new Stat("Speed", 0),
                new Stat("Special Attack", 0),
                new Stat("Special Defense", 0),};

        for (Stat stat:stats) {
            System.out.println("Write the number for the " + stat.getName() + " stat");
            stat.setQuantity(new Scanner(System.in).nextInt());
        }

        float maxPercent = 0;
        for (Stat stat:stats) {
            maxPercent += stat.getQuantity();
        }
        maxPercent /= 510;
        maxPercent *= 100;

        for (Stat stat:stats) {
            stat.recalculateStat(maxPercent);
            System.out.println(stat.getName() + ": " + stat.getQuantity());
        }
    }
}
