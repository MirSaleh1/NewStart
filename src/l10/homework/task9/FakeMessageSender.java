package l10.homework.task9;

public class FakeMessageSender implements MessageSender {
    public static String[]ms=new String[100];
    public static int count=0;


    @Override
    public void send(String to, String text) {
        ms[count++]=text;
    }
}
