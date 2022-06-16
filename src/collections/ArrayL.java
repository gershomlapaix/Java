package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();

        System.out.println("Initial size of array = "+ al.size());

        al.add(101);
        al.add(102);
        al.add(103);
        al.add(1, 140);

//        retrieval

        Iterator <Integer> iterate = al.iterator();
        int number = iterate.next();
        System.out.println("Accessed element: "+number);

        while (iterate.hasNext()){
            iterate.forEachRemaining((value)-> System.out.println(value+" "));
        }
    }
}
