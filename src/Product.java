public class Product {
    public String name;
    public double price;
    public int amount;

    public Product (String nameAtStart, double priceAtStart, int amountAtStart ){
        name = nameAtStart;
        price = priceAtStart;
        amount = amountAtStart;

    }

    public void printProduct(String nameAtStart, double priceAtStart, int amountAtStart){
        System.out.println("Name of Item: " + nameAtStart + " Price: " + priceAtStart + " Amount: " +amountAtStart );

    }


}
