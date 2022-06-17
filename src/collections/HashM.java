package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashM {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(1, "Mario");
        map.put(2, "Parades");
        map.put(3, "Tchuameni");

//        Traversing the map
        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry  entry= (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

//        HashMap implementation
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mango");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Grapes");

        System.out.println("List of the fruits : ");
        for (Map.Entry m: hashMap.entrySet()){
            System.out.println("("+m.getKey()+") "+m.getValue());
        }
    }
}
