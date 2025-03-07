import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a mensagem:");
        String message = scanner.nextLine();

        Notification notification = null;

        switch (choice) {
            case 1:
                notification = NotificationFactory.createNotification("email");
                break;
            case 2:
                notification = NotificationFactory.createNotification("sms");
                break;
            case 3:
                notification = NotificationFactory.createNotification("push");
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        if (notification != null) {
            notification.send(message);
        }

        scanner.close();
    }
}