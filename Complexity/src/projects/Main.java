package projects;

import projects.facade.Facade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println("Write the name of your file");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Select the format to compress the file");
        String format = new Scanner(System.in).nextLine();
        facade.convertVideo(name, format);
    }
}
