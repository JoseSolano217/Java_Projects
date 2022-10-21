package projects;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Client> queue = new LinkedList<>();
        Client client1 = new Client("Rob", 32);
        Client client2 = new Client("Robert", 19);
        Client client3 = new Client("Rodrigo", 20);
        Client client4 = new Client("Rosa", 22);
        Client client5 = new Client("Ronaldo", 23);

        queue.add(client1);
        queue.add(client2);
        queue.add(client3);
        queue.add(client4);
        queue.add(client5);

        for (Client client: queue) {
            System.out.println(client.toString());
        }
        System.out.println("");

        System.out.println(queue.poll());
        System.out.println(queue.peek() + "\n");

        queue.remove();queue.remove();

        for (Client client: queue) {
            System.out.println(client.toString());
        }
    }
}
