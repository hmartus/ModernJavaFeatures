package _04_pattern_matching_instanceof;

class Product{
    String model;
    Double price;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Product otherObj){
            return model.equals(otherObj.model) && price.equals(otherObj.price);
        }
        return false;
        // Product <- Keyboard
        //short form
        //return obj instanceof Keyboard otherObj && model.equals(otherObj.model) && price.equals(otherObj.price);
    }

    @Override
    public String toString() {
        return "Product(overrided) [model=" + model + ", price=" + price + "]";
    }
}
public class MainApplication {
    public static void main(String[] args) {
        var product1 = new Product();
        product1.model = "TUP";
        product1.price = 3.14;

        System.out.println("Product1: " + product1);
        System.out.println("Model: " + product1.model);
        System.out.println("Price: " + product1.price);
    }
}
