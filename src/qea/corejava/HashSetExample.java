package qea.corejava;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> idSet = new HashSet<>();
        idSet.add(1);
        idSet.add(2);
        idSet.add(3);

        idSet.add(3);
        System.out.println("Set Size: "+idSet.size());
        System.out.println("Elements: "+idSet);
        if (idSet.contains(2)) {
            System.out.println("ID 2 exists.");
        }
    }
}