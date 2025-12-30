public class NotificationService {
    public boolean sendEmail(String email, String message) {
        return email.contains("@") && !message.isEmpty();
    }
}




