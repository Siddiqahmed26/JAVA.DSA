
    import java.util.*;
public class evenodd {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number");
         int n = sc.nextInt();
        if(n%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }

        //USING TERNARY OPERTATOR
     
        String type = (n%2==0)? "even":"odd";
        System.out.println(type);


}
}
