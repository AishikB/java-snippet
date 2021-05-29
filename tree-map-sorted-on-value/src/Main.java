import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>((obj1, obj2) -> {
            return obj2-obj1;
        });

        map.put(3,"Jack");
        map.put(2,"John");
        map.put(4,"Peter");
        map.put(5,"Parker");
        map.put(1,"Jill");
        map.put(7,"Aishik");

        System.out.println(map);

    }

    public static TreeSet<Map.Entry<Integer, String>> sortValue(Map<Integer, String> map) {
        TreeSet<Map.Entry<Integer, String>> tree =
                new TreeSet<>((Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) -> {
            return e1.getValue().compareTo(e2.getValue());
        });
    }
}
