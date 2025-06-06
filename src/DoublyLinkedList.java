public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public boolean remove(int data) {
        if (isEmpty()) return false;

        Node current = head;

        while (current != null && current.getData() != data) {
            current = current.getNext();
        }

        if (current == null) return false;

        if (current == head) {
            head = current.getNext();
            if (head != null) head.setPrev(null);
        } else if (current == tail) {
            tail = current.getPrev();
            if (tail != null) tail.setNext(null);
        } else {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }

        size--;
        return true;
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getPrev();
        }
        System.out.println();
    }
}
