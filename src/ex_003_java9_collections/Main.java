package ex_003_java9_collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2, 3, 4, 5, 6, 7 , 8);
        Set<String> set = Set.of("Petya", "Vasya", "Kolya");

        System.out.println(list);
        System.out.println(set);

        Map<Integer, String> map = Map.of(1, "Petya", 777, "Kolya", 333, "Vasya");

        System.out.println(map.get(333));

        Map<Integer, String> mapEntries = Map.ofEntries(Map.entry(11, "Petya"),
                Map.entry(222, "Kolya"),
                Map.entry(38, "Vasya"));

        System.out.println(mapEntries.get(11));

    }

}
