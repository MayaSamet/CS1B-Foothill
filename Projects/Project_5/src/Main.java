public class Main {
    public static void main(String[] args) {
        linkedList russianEscape = new linkedList("Svetlana", "40254", "Novosibirsk");

        russianEscape.addFirst("Nina", "02838", "Yakutsk");
        russianEscape.addFirst("Andrei", "27710", "St. Petersburg");
        russianEscape.addFirst("Dmitri", "57299", "Sochi");

        System.out.println("---");
        System.out.println(russianEscape.findNode("Svetlana"));
        System.out.println(russianEscape.findNode("Nina"));
        System.out.println(russianEscape.findNode("Andrei"));
        System.out.println(russianEscape.findNode("Dmitri"));
        System.out.println("---");

        System.out.println(russianEscape.findNode("Meiko"));
        System.out.println("---");

        System.out.println("There are " + russianEscape.size() + " tourists on the Russian Escape roster");
    }

}
