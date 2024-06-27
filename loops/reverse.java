// public class reverse {
//     public static void main(String[] args) {
       
//       for (int n=1234; n>0; n=n/10){
//         System.out.print(n%10);



//       }
//     }
// }

// public class reverse {
//         public static void main(String[] args) {

//             int n =98948;
//             while(n>0){
//                int lastdigit=n%10;
//                System.out.print(lastdigit+" "); 
//                n=n/10;
//             }
//         }
//     }
           


public class reverse {
        public static void main(String[] args) {

            int n =2345643;
            int rev=0;
            while(n>0){
               int lastdigit=n%10;
               rev = (rev*10)+lastdigit;
               n=n/10;   
            }
            System.out.print(rev); 
               
        }
    }
           