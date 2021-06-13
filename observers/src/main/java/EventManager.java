
import java.util.*;
import java.util.logging.Logger;

public class EventManager {

    private static final Logger logger = Logger.getLogger(EventManager.class.getName());

    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        if(listeners.containsKey(eventType)) {
            listeners.get(eventType).add(listener);
        } else {
            listeners.put(eventType, Arrays.asList(listener));
            logger.info(listeners.get(eventType).toString());
        }
    }

    public void unsubscribe(String eventType, EventListener listener) {
        if(listeners.containsKey(eventType)) {
            listeners.get(eventType).remove(listener);
        } else {
            throw new RuntimeException("Listener Not found");
        }
    }

    public void notify(String eventType, String player) {
        if(listeners.containsKey(eventType)) {
            for (EventListener listener: listeners.get(eventType)
                 ) {
                listener.update(eventType, player);
            }
        } else throw new RuntimeException("Listeners not found of type :" + eventType);
    }

    public Map<String, List<EventListener>> getListeners() {
        return listeners;
    }

    public void setListeners(Map<String, List<EventListener>> listeners) {
        this.listeners = listeners;
    }
}