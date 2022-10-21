package projects;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList age = new DoublyLinkedList();
        age.addNode(3);
        age.addNode(7);
        age.addNode(5);
        age.addNode(34);
        age.addNode(53);
        age.addNode(76);
        age.addNode(6);
        age.addNode(999);
        age.addNode(7);
        age.addNode(43);
        age.addNode(2);

        age.printNodes();

    }
}
