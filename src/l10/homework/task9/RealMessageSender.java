package l10.homework.task9;

public class RealMessageSender implements MessageSender {
    @Override
    public void send(String to, String text) {
        System.out.println("real ms"+text);
    }
}
