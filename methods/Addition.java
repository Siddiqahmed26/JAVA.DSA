import java.util.Scanner;
public class Addition {
   

        public void add(){
            int a = 10;
            int b = 20;
            int c = a+b;
            System.out.println("Addition of two numbers is: "+c);
        }
        public void add(int a){
            int b = 20;
            int c = a+b;
            System.out.println("Addition of two numbers is: "+c);
        }
        public static void main(String[] args){
    Addition a1 = new Addition();
a1.add();
a1.add(20); 

}
}


// import java.util.Scanner;

// public class Addition {

//     public void add() {
//         int a = 10;
//         int b = 20;
//         int c = a + b;
//         System.out.println("Addition of two numbers is: " + c);
//     }

//     public void add(int a) {
//         int b = 20;
//         int c = a + b;
//         System.out.println("Addition of two numbers is: " + c);
//     }

//     public static void main(String[] args) {
//         Addition a1 = new Addition();
//         a1.add();
//         a1.add(20); 
//     }
// }
