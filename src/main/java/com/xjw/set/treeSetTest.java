package main.java.com.xjw.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeSetTest {

    public static void main(String[] args) {

        /*Set treeSet = new TreeSet();
        treeSet.add("all");
        treeSet.add("ball");
        treeSet.add("call");
        treeSet.add("sfsfj");
        treeSet.add("hjslff");
        treeSet.add("gidhkx");
        System.out.println(treeSet);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }*/
        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((int) o1) - (int) o2;
            }
        });

        treeSet1.add(12);
        treeSet1.add(100);
        treeSet1.add(52);
        treeSet1.add(1012);
        treeSet1.add(1);
        treeSet1.add(1504);
        treeSet1.add(501);
        treeSet1.add(253);

        System.out.println(treeSet1);
    }

}
