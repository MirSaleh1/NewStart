package l11.homework.task3;

public class Task03Main {

    public static void main(String[] args) {

        String[] inputs = {"NEW", "shipped", "INVALID_STATUS", "DELIVERED"};

        for (String input:inputs){
            try{
                OrderStatus status=OrderStatus.valueOf(input);
                System.out.println(status);
            }
            catch (IllegalArgumentException e){
                System.out.println("invalude argument");
            }
        }
    }
}
