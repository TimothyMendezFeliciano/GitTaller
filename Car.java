public class Car {
    private String model;
    private int price;

    public Car() {
        this.model = "Generic";
        this.price = 50;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int p) {
    this.price = p;
    }
    
    public void setModel(String m) {
        this.model = m;
    }
}
