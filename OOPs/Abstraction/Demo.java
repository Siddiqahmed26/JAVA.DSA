import java.util.*;

abstract class Shape{ //impure abstract class
float area;
abstract void input();
abstract void calcArea();   
void disp(){ // concrete method
    System.out.println("Area is: "+ area);
 }

}
 class square extends Shape{
    float l;
  
    void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the square: ");
    l= sc.nextFloat();
    }
     void calcArea(){
          area = l*l;
        
     }
    

 }
 class rectangle extends    Shape{
    float l,b;
    void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle: ");
    l= sc.nextFloat();
    System.out.println("Enter the breath of the rectangle: ");
    b= sc.nextFloat();
    }
     void calcArea(){
         area = l*b;
        
     }
   


 }
 class circle extends Shape{
    float r;
 
    void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    r= sc.nextFloat();
    }
     void calcArea(){
         area = 3.14f*r*r;
        
     }
     

 }
 class geometry{
    void allowShape(Shape ref){
    ref.input();
    ref.calcArea();
    ref.disp();
    }
 }

public class Demo {
public static void main(String[] args) {
    geometry g = new geometry();
    square s = new square();
    rectangle r = new rectangle();
    circle c = new circle();
    g.allowShape(s);
    g.allowShape(r);
    g.allowShape(c);

}    
}
