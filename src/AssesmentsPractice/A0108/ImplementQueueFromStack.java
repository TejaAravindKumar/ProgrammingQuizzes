package AssesmentsPractice.A0108;

import java.util.*;

public class ImplementQueueFromStack {
    public static void main(String[] args) {
        /*Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        Stack<Integer> stack2 = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();


        for (Integer num : stack1) {
            stack2.push(num);
            queue.offer(stack2.pop());
        }

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);*/

        CustomQueue<Integer> customQueue = new CustomQueue<>();
        for (int i = 1; i <= 10; i++) {
            customQueue.push(i);
        }
        System.out.println(customQueue);

        System.out.println(customQueue.pop());
        System.out.println(customQueue.pop());
        System.out.println(customQueue.pop());
        System.out.println(customQueue.pop());
        System.out.println(customQueue);


    }
}
