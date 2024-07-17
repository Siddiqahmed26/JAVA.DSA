import java.util.*;
class exceptions{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a : ");
int a=sc.nextInt();
    System.out.println("Enter the value of b : ");
   int  b=sc.nextInt();

    try{
        int c = a/b;
        System.out.println("The result is : "+c);
    }
    catch(Exception e){
        System.out.println("Error : "+e);

    }
    System.out.println("---------------------------------");
}
}