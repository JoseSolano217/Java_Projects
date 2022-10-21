package projects;

class DoublyLinkedList {
    class Node{
        Integer item;
        Node previous;
        Node next;

        public Node(Integer item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    public void addNode(Integer item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            if (current.previous != null) {
                System.out.println("previous " + current.previous.item);
            }
            System.out.println("actual " + current.item);
            if (current.next != null) {
                System.out.println("next " + current.next.item);
            }
            current = current.next;
            System.out.println("");
        }
    }
}
