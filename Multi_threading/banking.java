import java.util.*;
class bank{
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username");
        int username = sc.nextInt();
        System.out.println("Enter the password");
        int password = sc.nextInt();

    }
    void print(){
        try{
        for(int i=1; i<=5; i++){
            System.out.println("TRANSACTION IN PROCESS");
            Thread.sleep(3000);

        }

    }
    catch(Exception e){
            System.out.println("Exception occurred: "+e);
        }
    }
    void output(){
        int a,b,c;
        a=5000;
        b=6000;
        c=a+b;
        System.out.println("Total amount is: "+c);
    }
}

public class banking {
    public static void main(String[] args) {
        bank b = new bank();
        b.input();
        b.print();
        b.output();
    }
    
}
