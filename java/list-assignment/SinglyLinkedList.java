public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node runner = head;
        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }

    public void printValues() {
        if (head == null) {
            return;
        } else {
            Node runner = head;
            System.out.println("LinkedList: ");
            while(runner != null) {
                System.out.print(runner.value + " ");
                runner = runner.next;
            }
            System.out.println("End");
        }
    }

    public Object find(int value) {
        Node runner = head;
        while (runner != null) {
            if (runner.value == value) {
                return runner.value;
            }
            runner = runner.next;
        }
        return null;
    }
}
