package database;

import java.util.HashMap;
import java.util.Map;

public class UserDataBase {
    // will eventually be objects of user class type
    private Map<String, String> userLoginCred = new HashMap<>();

    public boolean addUser(String name, String password){
        userLoginCred.put(name,password);
        //if(contains name with the password as same entry return true otherwise false)
        System.out.println("User Added");
        return true;
    }

    public boolean checkForUsername(String name){
        userLoginCred.containsKey(name);
        if(userLoginCred.containsKey(name)) {
            System.out.println("User already added, choose another");
            return true;
        }
        System.out.println("No user currently registered");
        return false;
    }

    public boolean removeUser(String name, String Password){
        //removes if correct credentials
        return true;
    }

    public boolean loginAttempt(String name, String password){
        if(userLoginCred.containsKey(name) && userLoginCred.containsValue(password)){
            System.out.println("Login successful");
            return true;
        }
        System.out.println("login failed");
        return false;
    }
}
