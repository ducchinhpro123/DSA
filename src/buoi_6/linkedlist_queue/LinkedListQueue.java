package buoi_6.linkedlist_queue;


/* Queue Generic Type */
public class LinkedListQueue<E> {
    private ListNode<E> head, rear;
    private int queSize;

    public LinkedListQueue() {
        head = null;
        queSize = 0;
        rear = null;
    }

    public void enqueue(E data) {
        // Add data after the end node
        ListNode<E> node = new ListNode<>((E) data);
        // If the queue is empty, the head and tail nodes are pointing to the node
        if (head == null) {
            head = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        queSize++;
    }

    /* remove and return the first element */
    public E dequeue() {
        E data = peek();
        head = head.next;
        queSize--;
        return data;
    }

    public E first() {
        return head.data;
    }

    /* get the first element */
    public E peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return head.data;
    }

    /* Convert the linked list to Array and return*/
    public E[] toArray() {
        ListNode<E> node = head;

        E[] res = (E[]) new Object[size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = node.data;
            node = node.next;
        }
        return res;
    }

    public void print() {
        ListNode<E> node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    /* Get the length of the queue */
    private int size() {
        return queSize;
    }

    /* Judging whether the queue is empty */
    public boolean isEmpty() {
        return queSize == 0;
    }

    public static void main(String[] args) {

        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.dequeue();

        queue.print();

    }

}

