public class Challenge {

    private EventManager events;
    private String player;

    public Challenge() {
        this.events = new EventManager("open", "save");
    }

    public void loadGame(String player) {
        this.player = player;
        events.notify("load", player);
    }

    public void saveGame() throws Exception {
        if (this.player != null) {
            events.notify("save", player);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

    public void gotAchievement() throws Exception {
        if (this.player != null) {
            events.notify("achievement", player);
        } else {
            throw new Exception("Please start game");
        }
    }

    public EventManager getEvents() {
        return events;
    }

    public void setEvents(EventManager events) {
        this.events = events;
    }
}
