package l07.oop.fundamental.homework.task5;

public class Product {
    private String name;
    private double price;
    private double stock;

    public Product(String name, double price, double stock) {
        this.name = name;
       setPrice(price);
       setStock(stock);
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
       if (price<0)return;
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        if (stock<0)return;
        this.stock = stock;
    }
    public void sell(int quantity){
        if (quantity<=0)return;
        if (quantity>stock){
            System.out.println("not posibale");
            return;
        }
        stock-=quantity;
    }
    public void printSummary() {
        System.out.println("Məhsul: " + name + " | Qiymət: " + price + " | Stok: " + stock);
    }
}
