import java.util.*;     
public class arr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        int a[]=new int[5];
        
        for(i=0; i<=a.length-1;i++){
            System.out.println("Enter an elements of array");
            a[i]=sc.nextInt();
        }

        System.out.println("The elements of array are");
        for(i=0; i<=a.length-1;i++){

    
            System.out.println(a[i]);
        }        
}
}
