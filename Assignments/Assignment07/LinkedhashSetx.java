package Assignment07;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedhashSetx {
    public static void main(String[] args) {
       LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        System.out.println(hs);

        LinkedHashSet<Integer> hx = new LinkedHashSet<Integer>();
        hx.add(2);
        hx.add(6);
        hx.add(5);
        hx.add(8);
        System.out.println(hx);

        HashSet<String>hst=new HashSet<>();
        LinkedHashSet<String>lhst=new LinkedHashSet<>();
        hst.add("apple");
        hst.add("Orange");
        hst.add("banana");
        hst.add("mango");

        lhst.add("apple");
        lhst.add("orange");
     lhst.add("banana");
     lhst.add("mango");
        System.out.println(hst);
        for(String s: hst) {
         System.out.println(s);

         System.out.println(lhst);
         for (String x : lhst) {
          System.out.println(x);
         }
        }



    }
}
