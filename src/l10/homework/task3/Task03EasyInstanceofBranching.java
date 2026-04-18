package l10.homework.task3;

public class Task03EasyInstanceofBranching {

    public static void main(String[] args) {

        Notification[] notifications={new EmailNotification(),new SmsNotification()};

        for(Notification n:notifications){
            if (n instanceof EmailNotification){
                System.out.println("1");
            }else if (n instanceof SmsNotification){
                System.out.println("2");
            }
        }
    }
}
