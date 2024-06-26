import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        // Create an ArrayList object
        List<String> animals = new ArrayList<>();

        // Insertion: Insert element into animals
        animals.add("Alligator");
        animals.add("Baboon");
        animals.add("Camel");
        animals.add("Deer");
        animals.add("Elephant");

        System.out.println("ArrayList of Strings: " + animals);
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

        // Remove all animals
        animals.clear();
        System.out.println("Removed all animals: " + animals);
        System.out.println(" ");

        // Create an ArrayList of numbers
        List<Integer> numbers = new ArrayList<>();

        // Insertion: Insert element into numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("ArrayList of Numbers: " + numbers);
        System.out.println(" ");

        // Insert a number at the beginning of numbers
        numbers.addFirst(1);
        System.out.println("Inserted element at beginning of numbers: " + numbers);
        System.out.println(" ");

        // Insert a number at the end of numbers
        numbers.addLast(60);
        System.out.println("Inserted element at end of numbers: " + numbers);
        System.out.println(" ");

        // Insert a number at index (2) of numbers
        numbers.add(2, 22);
        System.out.println("Inserted 22 at index (2): " + numbers);
        System.out.println(" ");

        // Access the first number in numbers
        System.out.println("Numbers First Index: " + numbers.getFirst());
        System.out.println(" ");

        // Access the last number in numbers
        System.out.println("Numbers Last Index: " + numbers.getLast());
        System.out.println(" ");

        // Change the number of the 3rd number, index (2)
        numbers.set(2, 25);
        System.out.println("Changed 3rd number of numbers: " + numbers);
        System.out.println(" ");

        // Size of Numbers
        System.out.println("Size of Numbers: " + numbers.size());
        System.out.println(" ");

        // Remove the first number, first index - LastAnimal
        numbers.removeFirst();
        System.out.println("Deleted first number: " + numbers);
        System.out.println(" ");

        // Remove the last animal, last index - LastAnimal
        numbers.removeLast();
        System.out.println("Deleted last number: " + numbers);
        System.out.println(" ");

        // Size of Numbers
        System.out.println("Size of Numbers: " + numbers.size());
        System.out.println(" ");

        System.out.println("Printed Final ArrayList: " + numbers);
        System.out.println(" ");

        // Loop through Numbers: Using for loop
        System.out.println("Using for loop");
        System.out.println("---------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println(" ");

        // Loop through Numbers: Using for each loop
        System.out.println("Using for each loop");
        System.out.println("-------------------");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println(" ");

        // Sort Numbers
        Collections.sort(numbers);
        System.out.println("Sorted Numbers : " + numbers);
        System.out.println(" ");

        // Remove all numbers
        numbers.clear();
        System.out.println("Removed all numbers: " + numbers);

    }
}
