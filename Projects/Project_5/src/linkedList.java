public class linkedList {
    class StackNode
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

    private StackNode first;

    public linkedList(String n, String p, String d){
        first = new StackNode(n,p,d,null);
        System.out.println("---");
        System.out.println("New roster created: Russian Escape");
        System.out.println("First tourist - ");
        System.out.println("Tourist name: " + n);
        System.out.println("Passport number: " + p);
        System.out.println("Destination city: " + d);
    }

    public void addFirst(String n, String p, String d){
        //adds a new tourist to the beginning of the list
        first = new StackNode(n, p, d, first);
        System.out.println("---");
        System.out.println("New first tourist - ");
        System.out.println("Tourist name: " + n);
        System.out.println("Passport number: " + p);
        System.out.println("Destination city: " + d);
    }

    public String findNode(String touristName){
        // finds the tourist's name in the list and returns the destination.
        // Use iteration or recursion to traverse the list
        StackNode p = first;
        String destination = "";

        while(p != null)
        {
            if (p.touristName.equals(touristName)){destination = p.destinationCity;}
            p = p.next;
        }

        if (destination.equals("")) {return touristName + " isn't in this LinkedList";}
        return touristName + " is in " + destination;
    }

    public int size(){
        //returns the number of tourists in the list
        StackNode p = first;
        int counter = 0;

        while(p != null)
        {
            p = p.next;
            counter++;
        }
        //Return or display aggregate results here
        return counter;

    }
}

