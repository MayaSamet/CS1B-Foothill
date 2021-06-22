/**
 *
 * @author MayaSamet
 */

import java.util.*;

public class boundedStack {
    // make instance member ArrayDeque<Double> to hold spells
    ArrayDeque<Double> spellDeque = new ArrayDeque<Double>();

    public void load() {
        // get user input in loop. After 50 values remove oldest value

        // Create an instance of the Scanner class
        Scanner input = new Scanner(System.in);
        Double spell = 0.0;

        System.out.println("~**\"Load\" spellcasting mode**~");
        while (true) {
            System.out.print("Enter spell potency (any non-num to quit): ");
            try {
                spell = input.nextDouble();
            } catch (Exception e) {
                break;
            }

            System.out.println("Spell added with potency " + spell);

            if (spellDeque.size() > 49) {
                Double oldestSpell = spellDeque.getLast();
                System.out.println("Exceeded 50 spell limit, removing oldest spell with potency " + oldestSpell);
                spellDeque.removeLast();
            }

            spellDeque.push(spell);
        }
    }

    public void pop(){
        //display and remove the most recently added value from the ArrayDeque
        Double newestSpell = spellDeque.pop();
        System.out.println("~**\"Pop\" spellcasting mode**~");
        System.out.println("Unleashing most recently added spell with potency " + newestSpell);
    }

    public void unload(){
        // loop to display and remove the most recently added value in the ArrayDeque until empty
        // Should display 50 total values (5 during testing)
        System.out.println("~**\"Unload\" spellcasting mode**~");
        while (spellDeque.size() > 0) {
            Double newestSpell = spellDeque.pop();
            System.out.println("Unleashing spell with potency " + newestSpell);
        }
    }

}
