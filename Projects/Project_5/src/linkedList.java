public class linkedList {
    static class StackNode
    {
        public String touristName;
        // I changed the type of passport number to string because theoretically an ID can start with a 0
        // which causes problems if int
        public String passportNumber;
        public String destinationCity;

        public StackNode next;

        // constructor
        public StackNode(String n, String p, String d, StackNode t)
        {
            touristName = n;
            passportNumber = p;
            destinationCity = d;
            next = t;
        }
    }

    private static StackNode first;

    public linkedList(String n, String p, String d){
        first = new StackNode(n,p,d,null);
    }

    public static void addFirst(String touristName, String passportNumber, String destinationCity){
        //adds a new tourist to the beginning of the list
        first = new StackNode(touristName, passportNumber, destinationCity, first);
    }

    public static String findNode(String touristName){
        // finds the tourist's name in the list and returns the destination.
        // Use iteration or recursion to traverse the list
        StackNode p = first;
        String destination = "";

        while(p != null)
        {
            if (p.touristName.equals(touristName)){destination = p.destinationCity;}
            p = p.next;
        }
        //Return or display aggregate results here
        return destination;
    }

    public static int size(){
        //returns the number of tourists in the list
        StackNode p = first;
        int counter = 0;

        while(p != null)
        {
            counter++;
        }
        //Return or display aggregate results here
        return counter;

    }
}

