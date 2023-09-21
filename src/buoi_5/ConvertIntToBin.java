package buoi_5;

import java.util.Scanner;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
public class ConvertIntToBin {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input the integer: ");
            int n = sc.nextInt();
            while (n > 0) {
                int r = n % 2;
                stack.push(r);
                n /= 2;
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
