package lession09_SetAndMap.practice.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Khong duoc trung key
public class hashMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        System.out.println(map.get(3));

        /// duyet Map Cach1
        System.out.println("Cach 1");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        /// Duyet Map Cach2
        System.out.println("Cach 2");
        Set<Integer> set = map.keySet();
        System.out.println(set);
        for (Integer key : set) {
            System.out.println(key + "-" + map.get(key));
        }

        /// Duyet Map Cach3 <map.forEach + CTRL Space></map.forEach>
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + " - Value: " + value);
        });

    }
}
