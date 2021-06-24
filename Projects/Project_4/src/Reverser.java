import java.io.*;
import java.util.ArrayDeque;


public class Reverser {

    // instantiate private object of the ArrayDeque class to hold the poem stack
    private ArrayDeque<String> poemStack;

    public void FileToStack(String filename){
        try {
            // set reversePoem as the input stream
            FileInputStream poem = new FileInputStream("reversePoem.txt");

            // initialize line variable to hold each poem line
            String line = "";

            while((line = poem.readLine()) != null) {
                System.out.println(line);
                myStack.Push(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }

    }

    public void StackToFile(String filename){
        //write the contects of the ArrayDeque objec 
    }


}


