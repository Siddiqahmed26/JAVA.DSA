class Animal {
    void eat()
    {
        System.out.println("Animal is eating...");

    }
    void sleep()
    {
        System.out.println("Animal is sleeping...");
    }
    void walk()
    {
        System.out.println("Animal is walking...");
    }
}
    class Tiger extends Animal{
        @Override
        void eat()
        {
            System.out.println("Tiger is eating...");
        }
       

    }
    class Lion extends Animal{
        @Override
        void eat()
        {
            System.out.println("Lion is eating...");
        }

    }
    public class AnimalApp{
        public static void main(String[] args) {
            Tiger t = new Tiger();
            Lion l = new Lion();
            t.eat();
            t.sleep();
            t.walk();
            l.eat();
            l.sleep();
            l.walk();
        }
    }
    
