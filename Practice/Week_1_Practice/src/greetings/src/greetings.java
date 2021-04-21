package greetings.src;

class world
{
    public static void main(String[] args) {
        //object #1
        world Spanish = new world();
        Spanish.greetings("Hola");   //Value for the word variable goes here!!!!
    }

    public void greetings(String word)
    {
        int letters = 4;
        char firstletter = 'H';
        double pi = 3.14;
        System.out.println(word);
        System.out.println(letters);
        System.out.println(firstletter);
        System.out.println(pi);
    }
}