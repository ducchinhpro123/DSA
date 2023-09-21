package buoi_6;

import java.util.Arrays;

public class TestQueue {

    int queueSize;
    int front;
    int nums[];

    public TestQueue(int capacity) {
        front = queueSize = 0;
        nums = new int[capacity];
    }

    public int capacity() {
        return nums.length;
    }

    public void push(int val) {
        int rear = (front + queueSize) % capacity();
        nums[rear] = val;
        queueSize++;
    }

    public int pop() {
        int num = peek();
        front = (front + 1) % capacity();
        queueSize--;
        return num;
    }

    public int peek() {
        return nums[front];
    }

    public int size() {
        return queueSize;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int idx = front;
        while (idx != (front + queueSize) % capacity()) {
            System.out.print(nums[idx] + " ");
            idx = (idx + 1) % capacity();
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return queueSize == 0;
    }

    public static void main(String[] args) {
        TestQueue test = new TestQueue(10);
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);
        test.push(7);
        test.pop();
        test.pop();
        test.pop();
        test.pop();
        test.print();

        System.out.println("front: " + test.front);
        System.out.println("queueSize: " + test.queueSize);
        System.out.println(Arrays.toString(test.nums));
    }
}
