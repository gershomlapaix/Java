package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
* it doesn't order the elements in FIFO manner
* */
public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Egide");
        pq.add("La paix");
        pq.add("Verie");
        pq.add("Kareem");

        Iterator<String> itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        pq.remove();  // remove the head

        String elem = pq.poll();
        System.out.println("Deleted element : "+elem);

        Iterator<String> itr2 = pq.iterator();
        System.out.println("After removal : ");
        while(itr2.hasNext()){
            System.out.println(itr2.next()+" ");
        }
    }
}
