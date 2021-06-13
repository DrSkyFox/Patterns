import java.io.File;

public class LogOperationListener implements EventListener {
    private File log;

    public LogOperationListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, String player) {
        System.out.println("Save to log " + log + " Player " + player + " has performed " + eventType );
    }

    @Override
    public String toString() {
        return "LogOperationListener{" +
                "log=" + log +
                '}';
    }
}