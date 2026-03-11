package qea.corejava;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(1,"four");
        System.out.println(map);
        // 3. Getting data (get)
        System.out.println("Student with Roll 2: " + map.get(2));

        // 4. Checking if a Key exists
        if (map.containsKey(3)) {
            System.out.println("Roll 3 is present.");
        }

        // 5. Removing an entry
        map.remove(2);
        System.out.println("Final Map: " + map);
    }
}
