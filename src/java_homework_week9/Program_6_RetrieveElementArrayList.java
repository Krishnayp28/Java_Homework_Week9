package java_homework_week9;

import java.util.ArrayList;

/**
 * . Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Program_6_RetrieveElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Red");
        colour.add("Black");
        colour.add("Pink");

        System.out.println(colour + "\n");
        System.out.println(colour.get(2));

    }
}
