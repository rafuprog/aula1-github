package application;

/**
 *
 * @author Rafu
 */
public class SetGet01 {
    private String name;
    private double price;

    public SetGet01(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   
}
