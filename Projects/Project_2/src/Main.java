/**
 *
 * @author MayaSamet
 */

public class Main {
    public static void main(String[] args) {
        boundedStack myStack = new boundedStack();
        myStack.load();
        myStack.pop();
        // load again so that unload displays 50 total values
        myStack.load();
        myStack.unload();
        // remember to paste output into txt and submit with .java files
    }
}
