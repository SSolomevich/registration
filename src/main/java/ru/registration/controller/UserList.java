package ru.registration.controller;

/**
 * Created by 15 on 01.04.2017.
 */
import ru.registration.model.User;

import java.util.HashMap;
import java.util.Map;
public class UserList  {
    public static User findUser(String user){
        return (User)users.get(user);
    }
    public static boolean addUser(User user){
        boolean result = false;
        if ((!users.containsKey(user.getUser()))&&(user.getPassword()!=null)&&(!"".equals(user.getPassword()))){
            users.put(user.getUser(),user);
            result = true;
        }
        return result;
    }
    private static Map users = new HashMap();
}