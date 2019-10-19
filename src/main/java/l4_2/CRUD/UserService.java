package l4_2.CRUD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = new HashMap<>();
        User adminUs= new User ("admin", "adminPas","adminAa");
        users.put("admin",adminUs );

    }
    public User getLogin(String login){
            return users.get(login);
    }

    public boolean addUser(User user){
        User userFromMap = users.putIfAbsent(user.getLogin(), user);
        if(userFromMap==null){
            return true;
        }else{
            return false;
        }

    }
    public boolean deleteByLogin(String login){
        if(users.containsKey(login)){
            users.remove(login);
            return true;
        }else{
            return false;
        }
    }
    public boolean editUser(User user){
        User userFromMap = users.put(user.getLogin(), user);
        if(userFromMap==null){
            return false;
        }else{
            return true;
        }
    }
    public List<User> getAllusers(){
        return new ArrayList<>(users.values());

    }
    public boolean auth(String login, String password) {
        if (users.containsKey(login)) {
            if(users.get(login).getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
