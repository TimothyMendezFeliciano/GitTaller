public class Car {
    private String model;
    private double price;

    public Car() {
        this.model = "Generic";
        this.price = 50.00;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double p) {
    this.price = p;
    }
    
    public void setModel(String m) {
        this.model = m;
    }
    
    public void decreasePrice() {

     this.price = price-10%;   
    }
}
