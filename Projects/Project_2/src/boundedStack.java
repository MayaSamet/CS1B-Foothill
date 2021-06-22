/**
 *
 * @author MayaSamet
 */

import java.util.*;

public class boundedStack {
    // make instance member ArrayDeque<Double> to hold spells
    ArrayDeque<Double> spellDeque = new ArrayDeque<Double>();

    public void load() {
        // get user input in loop. After 50 values remove oldest value (test with 5 values)
        // Create an instance of the Scanner class
        Scanner input = new Scanner(System.in);
        Double spell = 0.0;

        while (true) {
            System.out.print("Enter spell potency (any non-num to quit): ");
            try {
                spell = input.nextDouble();
            } catch (Exception e) {
                break;
            }

            System.out.println("Spell added with potency " + spell);
            // REMEMBER TO CHANGE TO 49
            if (spellDeque.size() > 4) {
                Double lastSpell = spellDeque.getLast();
                // REMEMBER TO CHANGE TO 50
                System.out.println("Exceeded 5 spell limit, removing oldest spell with potency " + lastSpell);
                spellDeque.removeLast();
            }

            spellDeque.push(spell);
        }
    }

    public void pop(){
        //display and remove the most recently added value from the ArrayDeque
        Double firstSpell = spellDeque.pop();
        System.out.println("\"Pop\" spellcasting mode: ");
        System.out.println("Unleashing most recently added spell with potency " + firstSpell);
    }

    //public void unload(){
        // loop to display and remove the most recently added value in the ArrayDeque until empty
        // Should edisplay 50 total values (5 during testing)
    //}

}
