package HashSet;

import java.util.HashSet;

public class Hashing {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(8);
        set.add(1);

        System.out.println(set);

        // search
        if (set.contains(7)) {
            System.out.println("set contains");
        } else {
            System.out.println("Not contains");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
