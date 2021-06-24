import java.io.*;
import java.util.ArrayDeque;


public class Reverser {

    // instantiate private object of the ArrayDeque class to hold the poem stack
    private ArrayDeque<String> poemDeque = new ArrayDeque<String>(100);

    public void FileToStack(String filename){
        try {
            // set reversePoem as the input stream
            FileInputStream poem = new FileInputStream(filename);
            BufferedReader poemReader = new BufferedReader(new InputStreamReader(poem));

            // initialize line variable to hold each poem line
            String line;

            // loop through to each line to read into a string, print, and push to the ArrayDeque
            while((line = poemReader.readLine()) != null) {
                System.out.println(line);
                poemDeque.push(line);
            }

            poemReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            System.out.println("IO exception");
        }

    }

    public void StackToFile(String filename){
        // write the contents of the poemDeque object to a new file, reversed
        try{
            PrintWriter poemOutput = new PrintWriter(filename);

            String line;
            while(!poemDeque.isEmpty()){
                line = poemDeque.pop();
                System.out.println(line);
                poemOutput.println(line);
            }

            poemOutput.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }
    }

}





