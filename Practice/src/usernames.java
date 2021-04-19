import java.util.Scanner;

public class usernames {
    public static void main(String[] args) {
        // Create an instance of the Scanner class
        Scanner input = new Scanner(System.in);

        // prepare questions for the user
        String fn_question = "Enter your first name: ";
        String ln_question = "Enter your last name: ";

        // show the user the questions and retrieve their answers
        // tip: .next() always returns string type
        System.out.print(fn_question);
        String first = input.next();

        System.out.print(ln_question);
        String last = input.next();

        //produce the output
        System.out.println("These usernames are available for use:");
        System.out.println(first + last);
        System.out.println(last + first);
        System.out.println(first + " " + last);
        System.out.println(last + "-" + first);

    }
}
