import java.util.Scanner;
public class prime {
    public static void main(String[] args) {

        System.out.println("enter the number");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                isprime=false;


            }
            if(isprime==true){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
                 
            }
        }

    }

