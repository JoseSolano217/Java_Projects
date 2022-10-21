package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Shoppe shoppe = new Shoppe();
        Main m = new Main();
        boolean exit = false;
        while (!exit) {
            switch (m.menu()) {
                case 1:
                    shoppe.addClient();
                    break;
                case 2:
                    if (shoppe.getClients().isEmpty()) {
                        System.out.println("There are no clients, add some");
                        break;
                    }
                    for (Client client : shoppe.getClients()) {
                        System.out.println("Name: " + client.getName());
                        System.out.println("Age: " + client.getAge());
                        System.out.println("Number: " + client.getNumber() + "\n");
                    }
                    break;
                case 3:
                    if (shoppe.getClients().isEmpty()) {
                        System.out.println("There are no clients, add some");
                        break;
                    } else {
                        System.out.println("Which client do you want to edit?");
                        int pos = 0;
                        for (Client client : shoppe.getClients()) {
                            System.out.println("Client " + pos);
                            System.out.println("Name: " + client.getName());
                            System.out.println("Age: " + client.getAge());
                            System.out.println("Number: " + client.getNumber() + "\n");
                            pos++;
                        }
                        pos = m.keyboard.nextInt();
                        shoppe.editClient(pos);
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Cheeto");
            }
        }
    }
    public int menu() {
        System.out.println("What to do today?");
        System.out.println("""
                1. Add clients
                2. See clients
                3. Edit clients
                4. Finish day
                """);
        return keyboard.nextInt();
    }
}
