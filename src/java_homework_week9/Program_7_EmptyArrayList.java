package java_homework_week9;

import java.util.ArrayList;

/**
 *  Write a Java program to test if an array list is empty or not.
 */
public class Program_7_EmptyArrayList {
    public static void main(String[] args) {
        // creating an empty Arraylist
        ArrayList<String> car = new ArrayList<>();
        // Adding element to the arraylist
        printEmptyCheck(car);
        car.add("Honda");
        car.add("BMW");
        car.add("Audi");
        car.add("Toyota");
        // Display the list
        System.out.println("Arraylist" + car);
        // calling static method
        printEmptyCheck(car);

    }
    // static method to check if arraylist ia empty or not
    //by using predefined method isEmpty() of ArrayList
    //we will check arraylist is empty
    static void printEmptyCheck(ArrayList car){
        if(car.isEmpty())
            System.out.println("The arraylist is empty");
        else
            System.out.println("The arraylist is not empty");
    }
}
