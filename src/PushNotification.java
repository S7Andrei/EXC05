public class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Enviando push notification: " + message);
    }
}