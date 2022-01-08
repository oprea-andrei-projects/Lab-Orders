package ro.mycodeschool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodeschool.model.User;

import static org.junit.jupiter.api.Assertions.*;

class UserRepoTest {

    @Test
    void userInsert_test(){

        UserRepo userRepo = new UserRepo();
        User user = new User(1,"andrei","m@m.com","pass1","user");

        userRepo.insertUser(user);
    }

    @Test
    void userDelete_test(){

        UserRepo userRepo = new UserRepo();
        userRepo.deleteUser(1);
    }

    @Test
    void updateName_test(){

        UserRepo userRepo = new UserRepo();

        userRepo.updateName(2,"newName");
    }

    @Test
    void updateMail_test(){

        UserRepo userRepo = new UserRepo();

        userRepo.updateMail(2,"newMail");
    }

    @Test
    void updatePass_test(){
        UserRepo userRepo = new UserRepo();

        userRepo.updatePass(2,"newPass");

    }

}