public class Main {
    public static void main(String[] args) {
        linkedList russianEscape = new linkedList();

        linkedList.addFirst("Svetlana", "40254", "Novosibirsk");
        linkedList.addFirst("Nina", "02838", "Yakutsk");
        linkedList.addFirst("Andrei", "27710", "St. Petersburg");

        linkedList.findNode("Svetlana");
        linkedList.findNode("Nina");
        linkedList.findNode("Andrei");

        linkedList.findNode("Meiko");

        linkedList.size();
    }
}
