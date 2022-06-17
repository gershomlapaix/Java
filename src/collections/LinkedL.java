package collections;

import java.util.LinkedList;

// elements are stored in by linking them by pointers
public class LinkedL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("DOg");
        animals.add("cat");

        System.out.println("Linked list :"+ animals);
    }
}
