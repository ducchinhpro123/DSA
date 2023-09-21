package buoi_6;

import java.util.Stack;
import buoi_4.Node;
import buoi_4.SinglyLinkedList;

public class MyStack {
    private SinglyLinkedList list;

    public MyStack() {
        this.list = new SinglyLinkedList();
    }

    // push elememt
    public void push(int data) {
        list.addFirst(data);
    }

    // pop element, remove from top
    public int pop() {
        return list.removeFirst().data;
    }

    // as a pop element but not remove
    public int peek() {
        return list.first().data;
    }

    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    public void printStack() {
        Node node = list.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(5);
        st.printStack();
        st.push(3);
        st.printStack();
    }
}
