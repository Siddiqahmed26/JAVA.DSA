class parent{
    int age;
    parent(int age){
        this.age=age;
    }
    void disp(){
        System.out.println("Age is: "+ age);
    
    }
    public String toString(){
        return "Age is " + age;
    }
}






public class overrideStr {
    public static void main(String[] args) {
        parent p = new parent(20);
        p.disp();
    System.out.println(p.toString());
        
    }
    
}
