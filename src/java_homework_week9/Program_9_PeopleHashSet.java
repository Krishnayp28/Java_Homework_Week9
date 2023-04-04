package java_homework_week9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program_9_PeopleHashSet {
    public static void main(String[] args) {

        // create a hashmap object
        HashMap<String,Integer> people = new HashMap<>();

        // add keys and values (name age)
        people.put("Krishna", 18);
        people.put("Kavya", 25);
        people.put("Akshar", 21);
        people.put("Dheer", 31);


        // Iterating hashmap through for loop
        for (Map.Entry<String,Integer> set: people.entrySet()){
            // printing all element of a map
            System.out.println(set.getKey() + " = " + set.getValue());

        }
    }
}
