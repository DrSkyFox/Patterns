package usermap;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapUser {
    private static Map<Long, User> usersCache = new HashMap<Long, User>();



    public static void loadCache(HashMap<Long, User> users) {
        usersCache= users;
    }

    public static void addUser(User user) {
        usersCache.put(user.getId(),user);
    }

    public static User getUser(Long key) {
        if (usersCache.containsKey(key)) {
            return usersCache.get(key);
        }
        return null;
    }





}
