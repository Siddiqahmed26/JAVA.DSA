class Plane{
void land() {
System.out.println("Plane landed");
}
}

class Cargo extends Plane{
    void land() {
System.out.println("Cargo plane landed");
 }
}

class Passenger extends Plane{
    void land() {
System.out.println("Passenger plane landed"); 
}

}

class Fighter extends Plane{
void land() {
System.out.println("Fighter plane landed");
}
}
class Airport{
    void allowPlane(Plane ref) { 
        ref.land();
    
    }
}
    

    
    public class Airplane {
    
    public static void main(String[] args) {
    
    Cargo c = new Cargo();
    
    Passenger p = new Passenger();
    
    Fighter f = new Fighter();
    
    Airport a = new Airport();
    
    a.allowPlane(c);
    
    a.allowPlane(p);    
    
    a.allowPlane(f);
        

    }
}