package collections;

import java.util.Iterator;
import java.util.TreeSet;

/*
* Treeset implements the Set interface, that uses a tree storage.
* The objects in treeset are stored in ascending order
* */
public class TreeS {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("Kareem");
        tr.add("Mario");
        tr.add("Kareem");

        Iterator<String> it = tr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
