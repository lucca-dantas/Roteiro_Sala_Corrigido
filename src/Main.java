public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Inserindo elementos no início:");
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.printForward();

        System.out.println("Inserindo elementos no fim:");
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.printForward();

        System.out.println("Lista ao contrário:");
        list.printBackward();

        System.out.println("Removendo elemento 20:");
        list.remove(20);
        list.printForward();

        System.out.println("Removendo elemento 40:");
        list.remove(40);
        list.printForward();

        System.out.println("Removendo elemento 10:");
        list.remove(10);
        list.printForward();

        System.out.println("Removendo elemento inexistente 100:");
        System.out.println(list.remove(100) ? "Removido" : "Não encontrado");
    }
}
