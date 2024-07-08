public class Demo1{
    int a,b;
    static int x,y;

    Demo1(){
    System.out.println("Constructor block is executed");

    }
    static {
        System.out.println("Static block is executed");



    }
    {
        System.out.println("non static block is executed");

    }

    public static void main(String[] args){
        Demo1 d = new Demo1();
        
    }
}