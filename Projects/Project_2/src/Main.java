/**
 *
 * @author MayaSamet
 */

public class Main {
    public static void main(String[] args) {
        boundedStack spellStack = new boundedStack();

        System.out.println("~**~** Welcome to Maji **~**~");
        spellStack.load();
        spellStack.pop();

        // load again so that unload displays 50 total values
        spellStack.load();
        spellStack.unload();
    }
}
