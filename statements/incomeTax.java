// import java.util.*;
// public class incomeTax {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter Income");
//         int income = sc.nextInt();

//         if (income<500000){
//             System.out.println("No Tax");
//         }
//         else if(income>500000 && income<1000000){
//             System.out.println("Tax will be 20%\n" +((0.2)*income));
//         }
//          else if(income>1000000){
//             System.out.println("Tax will be 30%\n" +((0.3)*income));
//         }
//         else{
//             System.out.println("No tax");
//         }
//     }
// }

import java.util.*;
public class incomeTax{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        int tax;
         if(salary < 500000){
            tax = 0;
         }
            else if(salary >= 500000 && salary <= 1000000){
                tax = (int) ((double)salary * 0.2);

            }
            else{
                tax = (int) ((double)salary * 0.3);
            }
         System.out.println("your tax is :" +tax);
         }

    }

