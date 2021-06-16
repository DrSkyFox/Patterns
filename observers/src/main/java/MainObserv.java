public class MainObserv {
    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.getEvents().subscribe("load", new LogOperationListener("/path/to/log/file.txt"));
        challenge.getEvents().subscribe("save", new EmailNotificationListener("admin@example.com"));
        challenge.getEvents().subscribe("achievement", new LogOperationListener("/path/to/log/file.txt"));
        try {
            challenge.loadGame("Wonder Observer");
            challenge.gotAchievement();
            challenge.saveGame();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
