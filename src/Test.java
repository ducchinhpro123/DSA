import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        /* Initialization queue */
        Queue<Integer> queue = new LinkedList<>();

        /* Element */
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(5);
        queue.offer(4);

        /* 访问队首元素 */
        int peek = queue.peek();
        System.out.println(peek);

        /* 元素出队 */
        int pop = queue.poll();

        /* 获取队列的长度 */
        int size = queue.size();

        /* 判断队列是否为空 */
        boolean isEmpty = queue.isEmpty();

    }
}
