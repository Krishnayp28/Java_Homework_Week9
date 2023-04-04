package java_homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program_4_Colours_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Pink");
        colours.add("Black");
        colours.add("White");
        colours.add("Orange");
        colours.add("Purple");

        for (String i : colours){
            System.out.println(i);
        }
    }

}
