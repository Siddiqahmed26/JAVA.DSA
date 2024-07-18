import java.util.*;
class AlessthenB extends Exception{
    public String getMessage(){
        return "a is not less than b";
    }

}
public class demo3 {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int  b=sc.nextInt();
        try{
            if(a>b){
                c=a-b;
                System.out.println(c);
            }
            else {
                throw new AlessthenB();
            }
           
        }
        catch(AlessthenB e){
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------");
    }
    
}
