package ident;

import handlers.DataAccess;

import persists.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IdentityMapUser {
    private static IdentityMapUser instance ;

    private static Map<Long, User> usersCache = new HashMap<Long, User>();
    private static Set<DataAccess<User>> handlers;

    public IdentityMapUser getInstance() {
        if(instance == null) {
            instance = new IdentityMapUser();
        }
        return instance;
    }

    public static void addHandlers(DataAccess dataAccess) {
        if(handlers == null) {
            handlers = new HashSet<>();
        }
        handlers.add(dataAccess);
    }

    public static void loadCache(HashMap<Long, User> users) {
        usersCache= users;
    }

    public static void addUser(User user) {
        usersCache.put(user.getId(),user);
        if(handlers != null) {
            for (DataAccess<User> dataAccess : handlers
            ) {
                dataAccess.save(user);
            }
        }
    }

    public static User getUser(Long key) {
        if (usersCache.containsKey(key)) {
            return usersCache.get(key);
        }
        return null;
    }





}
