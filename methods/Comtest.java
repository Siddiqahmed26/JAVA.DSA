class Product {
    String name;
    double price;
    Company c;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void buy(Company c) {
        System.out.println(this.name +" "+ "is a product");
        System.out.println(this.price +" "+ " is the price");
        c.cInfo();

    }
}
class Company {
    String name;
    int stocks;

    Company(String name, int stocks) {
        this.name = name; 
        this.stocks = stocks;

    }

    void cInfo() {
        System.out.println(" COMPANY INFO :");
        System.out.println("company name" + this.name);
        System.out.println("company stocks" + this.stocks);
    }

}

public class Comtest {
    public static void main(String[] args) {

        Company c = new Company("Amazon", 10);

        Product p = new Product("Mobile", 14000);

        p.buy(c);

    }
}
