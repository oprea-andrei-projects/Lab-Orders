package ro.mycodeschool.controller;

import ro.mycodeschool.model.User;
import ro.mycodeschool.repository.UserRepo;

public class UserController {

    private UserRepo userRepo;

    public UserController(){

        userRepo = new UserRepo();
    }

    public void addUser(User user){

        userRepo.insertUser(user);
    }

    public void deleteUser(int id){

        userRepo.deleteUser(id);
    }

    public void updateUserName(int id, String newName){

        userRepo.updateName(id, newName);
    }

    public void updateUserMail(int id, String newMail){

        userRepo.updateMail(id, newMail);
    }

    public void updateUserPass(int id, String newPass){

        userRepo.updatePass(id,newPass);
    }
}
