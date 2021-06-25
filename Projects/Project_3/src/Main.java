import java.util.*;
import java.lang.Integer;

// This is a console application.

// Based on user interaction, do any of the following:
// 1. Create new instance of animal class & pass user input to mutator methods to set
//    private instance data for the animal class. You can decide how to determine which
//    class to use based on user input.
// 2. Create an ArrayList of Type iAnimal & add the new instance created. check that:
//   * compareTo to each instance already in the ArrayList (use loop)
//   * if compareTo says there's already an identical instance in the ArrayList,
//     display an error message & do not insert
//   * if ArrayList empty, just add it in.
// 3. When testing, add multiple instances of each animal class.
// 4. Use a loop to iterate through the ArrayList and display all data for each instance
//    using accessor or ToString methods.

public class Main {
    public static ArrayList<iAnimal> Zoo = new ArrayList<iAnimal>(10);

    public static void main(String [] args) {
        System.out.println("~* Welcome to Java Zoo *~");
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Would you like to add an animal to the zoo (a), " +
                    "view the current list of animals (v), or exit the process (q)? ");
            String response = input.nextLine();
            if(response.equals("q")){
                System.out.println("OK, goodbye!");
                break;
            } else if (response.equals("a")){
                iAnimal animal = createAnimal();
                addToArrayList(animal);
            } else {
                System.out.println("That's not a valid response!");
            }
        }

    }

    public static iAnimal createAnimal(){
        String animal;
        int IdTag;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("What type of animal would you like to add? \"s\" for salamander, \"h\" for hamster: ");
            animal = input.nextLine();
            System.out.print("Assign animal ID tag (int): ");
            IdTag = input.nextInt();

            if (animal.equals("s")) {
                Salamander sally = new Salamander();
                sally.setIdTag(IdTag);
                System.out.println("You created a salamander with ID tag " + IdTag + "! ");
                return sally;
            } else if (animal.equals("h")) {
                Hamster hammy = new Hamster();
                hammy.setIdTag(IdTag);
                System.out.println("You created a hamster with ID tag " + IdTag + "! ");
                return hammy;
            } else {
                System.out.println("Only salamanders (s) and hamsters (h) allowed at this zoo!");
            }
        }
    }

    public static void addToArrayList(iAnimal animal){
        if (Zoo.size() == 0){
            System.out.println("Successfully added animal to the zoo!");
            Zoo.add(animal);
        }
        else {
            int animalComparison;
            int isPresent = 0;
            for (int i = 0; i < Zoo.size(); i++) {
                animalComparison = animal.compare(animal, Zoo.get(i));
                if (animalComparison == 0) {
                    isPresent = 1;
                }
            }
            if (isPresent == 0) {
                System.out.println("Successfully added animal to the zoo!");
                Zoo.add(animal);
            } else {
                System.out.println("Whoops, there is already an animal with that ID tag at this zoo! Try again.");
            }
        }
    }
}
