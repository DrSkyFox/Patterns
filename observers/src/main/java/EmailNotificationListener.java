import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String player) {
        System.out.println("Email to " + email + " Player " + player + " has performed " + eventType );
    }

    @Override
    public String toString() {
        return "EmailNotificationListener{" +
                "email='" + email + '\'' +
                '}';
    }
}