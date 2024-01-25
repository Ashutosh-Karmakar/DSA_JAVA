package JavaCollections;

import java.util.*;

public class collections {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "hello");
        map.put(2, "world");

        System.out.println(map.get(1));
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}