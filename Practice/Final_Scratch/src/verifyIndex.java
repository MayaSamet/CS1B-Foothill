public class verifyIndex {
    public static void verifyIndex(int index){
        if (index > 5)
            throw new IndexOutOfBoundsException("Index out of bounds");
        System.out.println("Your number was " + index);
    }
}
