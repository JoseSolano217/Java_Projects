package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shoppe {
    private List<Client> clients;

    public Shoppe() {
        this.clients = new ArrayList<>();
    }

    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void addClient() {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            Client client = new Client();
            System.out.println("Input the name of the new client");
            client.setName(keyboard.next());
            System.out.println("Input the phone number of the new client");
            client.setNumber(keyboard.nextInt());
            System.out.println("Input the age of the new client");
            client.setAge(keyboard.nextInt());
            clients.add(client);
            System.out.println("Finished, input 1 to continue, or 0 to exit");
            if (keyboard.nextInt() == 0) {
                exit = true;
            }
        }
    }
    public void editClient(int pos) {
        Scanner keyboard = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Input the new name of the client");
        client.setName(keyboard.next());
        System.out.println("Input the new phone number of the client");
        client.setNumber(keyboard.nextInt());
        System.out.println("Input the new age of the client");
        client.setAge(keyboard.nextInt());
        clients.set(pos, client);
        System.out.println("Finished");
    }
}
