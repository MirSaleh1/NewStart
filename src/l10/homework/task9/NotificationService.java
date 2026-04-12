package l10.homework.task9;

public class NotificationService {
    private MessageSender ms;

    public NotificationService(MessageSender ms) {
        this.ms = ms;
    }
    public void notifyUser(String user, String msg) {
        ms.send(user, msg);
    }
}
