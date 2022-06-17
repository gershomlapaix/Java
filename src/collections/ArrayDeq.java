package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * In ArrayDeque, can add and remove elements from both sides
 * Null elements are not allowed in the ArrayDeque
 * ArrayDeque is not thread safe, in the absence of external synchronization
 *
 */
public class ArrayDeq {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Marv");
        deque.add("Bely");
        deque.add("Queen");
        deque.add("Bely");

        for (String str: deque){
            System.out.println(str);
        }

        System.out.println("The first element : "+deque.peek());
    }
}
