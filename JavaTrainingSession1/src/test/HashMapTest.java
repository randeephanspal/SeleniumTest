package test;
import java.util.*;

class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer,String> hm =new HashMap<>();
        System.out.println("Size of HashMap:" + hm.size());
        hm.put(1,"Raj");
        hm.put(2,"Ram");
        hm.put(2,"Ravi");
        System.out.println("Size of hashMap after addition: "+hm.size());

    }


}
