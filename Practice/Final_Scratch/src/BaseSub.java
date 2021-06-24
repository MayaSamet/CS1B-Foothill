class Base {
    void show()
    {
        System.out.println("Base");
    }
}

// Inherited class
class Sub extends Base {
    // This method overrides show() of Parent
    @Override
    void show()
    {
        System.out.println("Sub");
    }
}
  