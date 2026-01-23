package LinkedListDT;

public class Easy {

    // head of linked list
    Node head;

    // node
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add on first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add on last
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        // traverse on nodes
        Node currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    // print linked list nodes
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // Insert value on linked list operation
    static void insertLL() {
        Easy linkedList = new Easy();

    }

    public static void main(String[] args) {
        Easy list = new Easy();

        list.addFirst("I");
        list.addFirst("AM");
        list.addFirst("Ravii");
        list.printList();
    }
}
