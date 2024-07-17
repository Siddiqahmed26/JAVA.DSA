public class ducking {

    void fun1(){
        fun2();
    }
    void fun2(){
    
    int a=10;
    int b=0;
    int c= a/b;
    System.out.println("The result is : "+c);    
    }
    public static void main(String[] args) {
        ducking d = new ducking();
        try{
            d.fun1();
    }
    catch (Exception e){
        System.out.println("Error : "+e);
    }
    
}
}
