package l07.oop.fundamental.homework.task10;

public class Order {
    private CartItem[] cartItems=new CartItem[100];
    private int count=0;

    public double calculateSubtotal(){
        double allItemsValue=0;
        for (int i = 0; i < count; i++) {
            allItemsValue+=cartItems[i].getUnitPrice()*cartItems[i].getQuantity();
        }
        return allItemsValue;
    } public double calculateTotal(double taxRate, double shipping){
        double total=calculateSubtotal();
        return (total+(total*taxRate))+shipping;
    }
    public void printInvoice(){
        for (int i = 0; i < count; i++) {
            System.out.println(cartItems[i]);
        }
    }

    public void addCartItem(CartItem c){
        if (count >= 100) {
            System.out.println("eror: " + c.getName() + " course is full");
            return ;
        }
        for (int i = 0; i < count; i++) {
            if (c==cartItems[i]){
                System.out.println("already exsist");
                return ;
            }
        }
       cartItems[count++]=c;
    }

}
