import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //Java Stack
        Stack<String> names = new Stack<>();

        names.push("ivailo");
        names.push("pesho");
        names.push("gosho");
        //pop
        System.out.println(names.pop());
        System.out.println();

        //CustomStack
        CustomStack<String> customStack = new CustomStackImpl<>();
        customStack.push("ivailo1");
        System.out.println(customStack.size());
        customStack.push("ivailo2");
        System.out.println(customStack.size());
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.isEmpty());

        System.out.println();
        System.out.println();
        //CustomQueue
        CustomQueue<String> customQueue = new CustomQueueImpl<>();
        customQueue.add("Ivailo1");
        customQueue.add("Ivailo2");
        System.out.println(customQueue.size());
        System.out.println(customQueue.peek());
        System.out.println(customQueue.poll());
        System.out.println(customQueue.size());


    }
}
