package qea.corejava;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Car1");
        cart.add("Car2");
        cart.add("Car3");
        cart.add("Car4");
        System.out.println("Item at index1"+cart.get(1));
    }


}
