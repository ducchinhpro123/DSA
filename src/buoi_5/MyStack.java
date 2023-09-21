package buoi_5;

public class MyStack<E> {
    public E[] elements; // type generic

    public int CAPACITY; // capacity for stack to storage
    public int t; // t as a size of the stack or top

    public MyStack(int capacity) {
        this.CAPACITY = capacity;

        // unchecked cast, not big deal
        this.elements = (E[]) new Object[capacity];
        t = 0; // top of the stack, initial empty
    }

    // as a default, capacity will we 10
    public MyStack() {
        this.CAPACITY = Constant.SIZE;

        // unchecked cast, not big deal
        this.elements = (E[]) new Object[CAPACITY];
        t = 0; // top of the stack, initial empty
    }

    // push elememt
    public void push(E e) {
        // if stack is full, we cannot insert into stack
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        // increament size t as insert element
        elements[t++] = e;
    }

    // pop element, remove from top
    public E pop() {
        if (isEmpty())
            return null;
        E element = elements[--t];
        elements[t] = null;
        return element;
    }

    // as a pop element but not remove
    public E peek() {
        if (isEmpty())
            return null;
        E e = elements[t - 1];
        return e;
    }

    public boolean isEmpty() {
        return t == 0; // if the stack is empty, return true
    }

    public boolean isFull() {
        return t == CAPACITY; // CAPACITY as a size to storage
    }

    public void printStack() {
        if (isEmpty())
            return;
        int i = 0;
        System.out.print("( ");
        while (i <= t - 1) {
            System.out.print(elements[i++] + " ");
        }
        System.out.print(")");

    }

}
