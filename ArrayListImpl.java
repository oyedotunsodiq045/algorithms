import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        // Create an ArrayList object
        List<String> animals = new ArrayList<>();

        // Insertion: Insert animals into listOne
        animals.add("Alligator");
        animals.add("Baboon");
        animals.add("Camel");
        animals.add("Deer");
        animals.add("Elephant");

        System.out.println("ArrayList: " + animals);
        System.out.println(" ");

        // Insert an animal at the beginning of animals
        animals.addFirst("FirstAnimal");
        System.out.println("Inserted Element at beginning of Animals: " + animals);
        System.out.println(" ");

        // Insert an animal at the end of animals
        animals.addLast("LastAnimal");
        System.out.println("Inserted Element at end of Animals: " + animals);
        System.out.println(" ");

        // Insert an animal at index (2) of animals
        animals.add(2, "ThirdAnimal");
        System.out.println("Inserted ThirdAnimal at index (2): " + animals);
        System.out.println(" ");

        // Access the first animal in animals
        System.out.println("Animals First Index: " + animals.getFirst());
        System.out.println(" ");

        // Access the last animal in animals
        System.out.println("Animals Last Index: " + animals.getLast());
        System.out.println(" ");

        // Change the name of the 3rd animal, index (2)
        animals.set(2, "AnimalNameChanges");
        System.out.println("Changed name of 3rd animal: " + animals);
        System.out.println(" ");

        // Size of Animals
        System.out.println("Size of Animals: " + animals.size());
        System.out.println(" ");

        // Remove the last animal, last index - LastAnimal
        animals.removeLast();
        System.out.println("Deleted last animal: " + animals);
        System.out.println(" ");

        // Size of Animals
        System.out.println("Size of Animals: " + animals.size());
        System.out.println(" ");

        System.out.println("Printed Final ArrayList: " + animals);
        System.out.println(" ");

        // Loop through Animals: Using for loop
        System.out.println("Using for loop");
        System.out.println("---------------");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println(" ");

        // Loop through Animals: Using for each loop
        System.out.println("Using for each loop");
        System.out.println("-------------------");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println(" ");

        // Sort Animals
        Collections.sort(animals);
        System.out.println("Sorted Animals : " + animals);
        System.out.println(" ");

        // Remove all animals frm animals
        animals.clear();
        System.out.println("Removed all animals: " + animals);

        // Create an ArrayList of numbers
    }
}
