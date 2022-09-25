package Week2.ClassesWithAttribute;

public class Main {
    public static void main(String[] args){
        Product product = new Product(1,"Laptop","Asus",5000,3,"blue");
        //product.name = "Laptop";
        //product.id =1 ;
        //product.description = "Asus Laptop";
        //product.price = 5000;
        //product.stockAmount = 3;
        //System.out.println(product.name);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());

        Product product1 = new Product();
        product1.setId(2);
        product1.setName("Laptop");
        product1.setDescription("Lenovo Laptop");
        product1.setPrice(7500);
        product1.setStockAmount(5);
        product1.setColor("red");

        productManager.add(product1);
        System.out.println("Product Code: " + product1.getCode());
    }
}
