package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashIteretor {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(8);
        set.add(1);

        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
