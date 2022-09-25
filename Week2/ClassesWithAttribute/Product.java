package Week2.ClassesWithAttribute;

public class Product {
    private int id;
    private String name;
    private String description;
    private double _price;
    private int _stockAmount;
    private String _color;
    private String code;

    public Product(){
        System.out.println("Constructor worked.");
    }

    public Product(int id,String name,String description,double price,int stockAmount,String color) {
        System.out.println("Parameter constructor worked.");
        this.id=id;
        this.name=name;
        this.description=description;
        _color=color;
        _price=price;
        _stockAmount=stockAmount;
    };

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id=id;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return _price;
    }
    public void setPrice(double price) {
        _price = price;
    }
    public int getStockAmount() {
        return _stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }
    public String getColor() {
        return _color;
    }
    public void setColor(String color) {
        _color = color;
    }
    public String getCode() {
        return this.name.substring(0,1) + id;

    }
}