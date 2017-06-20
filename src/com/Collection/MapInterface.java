package com.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by aojha on 6/15/17.
 */
public class MapInterface {

    public static void main(String[] args) {

        Map <Integer, String> map = new HashMap<Integer, String>();

        map.put(10, "Abhishek");
        map.put(11, "Akash");
        map.put(12, "Mani");

        System.out.println(map);

        map.remove(11);

        System.out.println(map);

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
