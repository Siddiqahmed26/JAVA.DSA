import java.util.*;
public class numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         int i=1;
         int sum=0;
         
        // printing numbers from 1-1000
        while(i<=n){
            sum = sum+i;
            i++;
            
            

        }
        System.out.print(sum);
    }
     
}
