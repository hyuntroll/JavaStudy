package StudyJava.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasssMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("A", 23456);
        System.out.println(map.get("A"));

        iteratorUsingForEacH(map);
        iteratorUsingIterator(map);
    }

    static void iteratorUsingForEacH(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static void iteratorUsingIterator(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();;
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while ( i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
