import java.util.*;
public class n {
    public static void main(String args[]){

        // printing numbers from 1-n 
        
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;

        }

    }
    
}
