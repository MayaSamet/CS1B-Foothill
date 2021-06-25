public class linkedList {
    // these must be held in a nested node class
    private String touristName;
    // I changed the type of passport number to string because theoretically an ID can start with a 0
    // which causes problems if int
    private String passportNumber;
    private String destinationCity;

    public static void addFirst(String touristName, String passportNumber, String destinationCity){
        //adds a new tourist to the beginning of the list

    }

    public static int size(){
        //returns the number of tourists in the list

    }

    public static String findNode(String touristName){
        // finds the tourist's name in the list and returns the destination.
        // Use iteration or recursion to traverse the list
    }
}
