package main.java.com.xjw.map;

import java.util.*;

public class Map_ {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("少林寺","僧人");
        map.put("学校","老师");
        map.put("公司","员工");
        map.put("公司","11");

        //第一组：先取出所有的key，通过key取出对应的value
        Set keySet = map.keySet();

        //(1) 增强for
        System.out.println("------第一种遍历方式------");
        for (Object key : keySet) {
            Object o = map.get(key);
            System.out.println(o);
        }

        //(2)迭代器遍历
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            //(1获取key的值
            Object next = iterator.next();
            //(2)通过key值获取value值
            Object o = map.get(next);
            System.out.println("key值：" + next + "--" + "value值：" + o);
        }


        //第二组：把所有的value值取出来
        Collection values = map.values();

        //这里可以使用所有的Collection遍历方式
        //(1)增强for
        //取出所有的value值
        for (Object value : values) {
            System.out.println(value);
        }

        //(2)迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
        }


        //第三组：通过entrySet，遍历获得k-v
        Set entrySet = map.entrySet();  //EntrySet<Map.Entry<K,V>>

        //(1)增强for，
        for (Object entry : entrySet) {
            //将entry 转成 Map.Entry
            Map.Entry entry1 = (Map.Entry) entry;
            entry1.getKey();
            entry1.getValue();
        }

        //(2)迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            //HashMap$Node 实现了Map.Entry，底层还是Node
            System.out.println(next.getClass());
            //向下转型 Map.Entry
            Map.Entry me = (Map.Entry)next;
            me.getValue();
            me.getKey();
        }
    }

}


