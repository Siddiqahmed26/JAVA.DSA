public class human {
    String name = "Rama";
    void eat(){
        System.out.println( name +" " +  "is eating");

    }
    void sleep(){
        System.out.println(name +" "+"is sleeping");

    }
    void read(){
        System.out.println(name +" " +"is reading");

    }

    public static void main(String[] args) {
        human h1 = new human();
        h1.eat();
        h1.sleep();
        h1.read();
    }


}
