package buoi_4;

public class SinglyLinkedList {
    int size;
    public Node head;
    Node tail;

    public SinglyLinkedList() {
        this.size = 0;
        head = null;
        tail = null;
    }

    public int getSize() {
        return this.size;
    }

    // get the first element. For implement the stack using linked list
    public Node first() {
        if (head == null) {
            return null;
        }
        Node first_e = new Node(head.data);
        first_e = head.next;
        return first_e;
    }

    // add first node
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            size++;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // add last node
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    // remove first node
    public Node removeFirst() {
        Node curr = head;
        if (isEmpty()) {
            System.out.println("The Linked list is empty");
            return null;
        }

        head = head.next;
        curr.next = null;
        size--;
        return head;
    }

    // remove last node
    public Node removeLast() {

        // if the list is empty
        if (head == null) {
            return null;
        }
        // if there is only one node in the list
        if (head.next == null) {
            Node removedNode = head;
            head = tail = null;
            size--;
            return removedNode;
        }
        Node curr = head;
        Node previousNode = findPrevious(head, tail);

        // remove the last node by updating the previous node's next reference
        previousNode.next = null;
        tail = previousNode;
        size--;
        return curr;
    }

    // insert at specific position
    public void insert(int data, int pos) {
        if (pos < 0)
            throw new IllegalArgumentException("Invalid position: " + pos);

        if (pos == 0) {
            addFirst(data);
            size++;
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            if (curr == null)
                throw new IllegalArgumentException("Invalid position: " + pos);

            curr = curr.next;
        }
        if (curr == null)
            throw new IllegalArgumentException("Invalid position: " + pos);

        newNode.next = curr.next;
        curr.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        size++;
    }

    // find previous node
    public Node findPrevious(Node head, Node target) {
        if (head == null || head == target) {
            return null;
        }

        Node prev = head;
        while (prev != null && prev.next != target) {
            prev = prev.next;
        }

        if (prev.next == target) {
            System.out.println(prev.data);
            return prev;
        }
        return null;
    }

    // print link list
    public void printLinkedList() {
        Node curr = head;
        while (curr != null) {
            if (curr.next == null) {
                System.out.print(curr.data + " -> null");
                return;
            }
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public void makeEmpty() {
        this.size = 0;
        head = tail = null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public static void main(String[] args) {

        // Menu
        SinglyLinkedList list = new SinglyLinkedList();
        int choice = 0;
        while (choice != 7) {
            System.out.println("\n1. Add first");
            System.out.println("2. Add last");
            System.out.println("3. Remove first");
            System.out.println("4. Remove last");
            System.out.println("5. Print list");
            System.out.println("6. Make empty");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = Input.inputInt();
                    list.addFirst(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    int data1 = Input.inputInt();
                    list.addLast(data1);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.printLinkedList();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

}
