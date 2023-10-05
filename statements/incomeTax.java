import java.util.*;
public class incomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Income");
        int income = sc.nextInt();

        if (income<500000){
            System.out.println("No Tax");
        }
        else if(income>500000 && income<1000000){
            System.out.println("Tax will be 20%\n" +((0.2)*income));
        }
         else if(income>1000000){
            System.out.println("Tax will be 30%\n" +((0.3)*income));
        }
        else{
            System.out.println("No tax");
        }
    }
}

