package ro.mycodeschool.controller;

import org.junit.jupiter.api.Test;
import ro.mycodeschool.model.User;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    @Test
    void addUser_test(){
        UserController uc = new UserController();
        uc.addUser(new User("Andrei","mail@mail.com","password","user"));
    }

    @Test
    void deleteUser_test(){
        UserController uc = new UserController();
        uc.deleteUser(7);

    }

    @Test
    void updateUser_test(){
        UserController uc = new UserController();
        uc.updateUserName(6,"Cristi");
        uc.updateUserMail(6,"cristi@mail.com");
        uc.updateUserPass(6,"cristipass");
    }

}