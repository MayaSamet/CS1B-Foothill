import java.io.*;

public class Main {
    public static void main(String [] args) {
        Reverser poemReverser = new Reverser();
        poemReverser.FileToStack("reversePoem.txt");
        poemReverser.StackToFile("reversedReversePoem.txt");
    }

}
