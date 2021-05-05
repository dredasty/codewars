package org.fresh.patterns.objectpool;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class UsersPool {
    private static final int EXP_TIME = 6000;
    private static Map<UserObject, Long> availableUsers = new ConcurrentHashMap<>();
    private static Map<UserObject, Long> inUseUsers = new ConcurrentHashMap<>();

    public synchronized static UserObject getUser() {
        long now = System.nanoTime();
        if (!availableUsers.isEmpty()) {
            for (Map.Entry<UserObject, Long> entry : availableUsers.entrySet()) {
                if (now - entry.getValue() > EXP_TIME) {
                    popElement(availableUsers);
                } else {
                    UserObject user = popElement(availableUsers, entry.getKey());
                    push(inUseUsers, user, now);
                    return user;
                }
            }
        }
        return createUserObject(now);
    }

    private synchronized static UserObject createUserObject(long now) {
        final UserObject user = new UserObject(RandomStringUtils.randomAlphabetic(7), RandomUtils.nextInt());
        push(inUseUsers, user, now);
        return user;
    }

    private synchronized static UserObject popElement(Map<UserObject, Long> map) {
        final Map.Entry<UserObject, Long> entry = map.entrySet().iterator().next();
        final UserObject key = entry.getKey();
        map.remove(key);
        return key;
    }

    private synchronized static UserObject popElement(Map<UserObject, Long> map, UserObject key) {
        map.remove(key);
        return key;
    }

    private synchronized static void push(Map<UserObject, Long> map, UserObject user, long now) {
        map.put(user, now);
    }

    public synchronized static void releaseObject(UserObject user) {
        availableUsers.put(user, System.nanoTime());
        inUseUsers.remove(user);
    }

}
