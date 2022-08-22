package main.java.com.xjw.map;

import java.util.Comparator;
import java.util.TreeMap;

public class treeMapTest {
    public static void main(String[] args) {

        //TreeMap treeMap = new TreeMap();
        //有参构造器
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        treeMap.put("123","456");
        treeMap.put("ajfa","fjalf");
        treeMap.put("sfj","jfsdjaf");
    }
}
