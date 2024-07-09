public class app {
    int a;
    static int count;

    app(){
        count++;

    }
    public static void main(String [] args){
        app a1 = new app();
        app a2 = new app();
        app a3 = new app();
        app a4 = new app();
        app a5 = new app();
System.out.println("The number of objects created is: "+count);

    }

}
