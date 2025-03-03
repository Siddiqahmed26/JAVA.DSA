import java.util.*; //MULTI THREADED PROGRAM



//THREAD 1 
class User extends Thread{
    User(){ //CONSTRUCTOR
    start();
    }
public void run(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the username");
    int username = sc.nextInt();
    System.out.println("Enter the password");
    int password = sc.nextInt();

}
}


//THREAD 2

class Transaction extends Thread{
    Transaction(){ //CONSTRUCTOR
    start();
    }
public void run(){
    for(int i=0; i<=5; i++){
        System.out.println("LOADING");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("Exception occurred: "+e);
        }
    }
    

}
}

//THREAD 3

class Test extends Thread{
    Test(){ //CONSTRUCTOR
    start();
    }
public void run(){

    int a,b,c;
    a=5000;
    b=6000;
    c=a+b;
    System.out.println("Total amount is: "+c);
}
}


class task{
    public static void main(String[] args) {
        User u = new User();
        Transaction t= new Transaction();
        Test t1 = new Test();
        
    }
}