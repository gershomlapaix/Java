package collections;

import java.util.HashSet;
import java.util.Iterator;

/*
* Hashset is used to create collection that uses a hash table for storage
* contains unique elements
* */
public class HashS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One");

        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
