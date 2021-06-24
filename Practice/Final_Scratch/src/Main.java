

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        // Test GList (Q4)
        GList<Integer> score = new GList<Integer>(9);
        score.addFirst(1);
        score.addFirst(4);
        //System.out.println(score);

        // Base + Sub (Q7)
        Base b = new Base();
        Sub s = new Sub();

        Base bmirror = b;
        Sub smirror = s;

        bmirror.show();
        smirror.show();

        b = s;
        s.show();
        b.show();

        // GalaxyData (Q20)


        FileInputStream filey = new FileInputStream("test.txt");
        char c1 = (char) filey.read();
        char c2 = (char) filey.read();
        char c3 = (char) filey.read();
        char c4 = (char) filey.read();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        try{
            char c5 = (char) filey.read();
            System.out.println(c5);
        } catch (Exception e){
            System.out.println("Womp Wompwomp");
        }

        char c6 = (char) filey.read();
        System.out.println(c6);

        verifyIndex.verifyIndex(4);


    }
}
