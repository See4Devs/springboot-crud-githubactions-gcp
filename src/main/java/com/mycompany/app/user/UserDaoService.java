package com.mycompany.app.user;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount =3;
    static {
        users.add(new User(1,"Adam", 21, "adam@mycompany.com"));
        users.add(new User(2,"John", 25, "john@mycompany.com"));
        users.add(new User(3,"Siri", 32, "siri@mycompany.com"));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user:
                users) {
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public User update(User updatedUser){
        for (User user:
                users) {
            if(user.getId().equals(updatedUser.getId())){
                user.setName(updatedUser.getName());
                user.setAge(updatedUser.getAge());
                user.setEmail(updatedUser.getEmail());
                return user;
            }
        }
        return null;
    }

    public User delete(int id){
        for (User user:
                users) {
            if(user.getId().equals(id)){
                users.remove(user);
                return user;
            }
        }
        return null;
    }
}
