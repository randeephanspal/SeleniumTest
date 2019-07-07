package test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Sam");
        hs.add("Eric");
        hs.add("Sam");
        hs.add("James");

        System.out.println(hs);

        Iterator it = hs.iterator();

        while(it.hasNext()){
//            String s = (String)it.next();

            System.out.println(it.next());
        }

    }

}
