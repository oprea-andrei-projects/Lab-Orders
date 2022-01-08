package ro.mycodeschool.controller;

import ro.mycodeschool.model.Admin;
import ro.mycodeschool.repository.AdminRepo;

public class AdminController {

    private AdminRepo adminRepo;

    public AdminController(){

        adminRepo = new AdminRepo();
    }
    public void addAdmin(Admin admin){

        adminRepo.insertAdmin(admin);

    }

    public void deleteAdmin(int id){

        adminRepo.deleteUser(id);
    }

    public void updateName(int id, String newName){

        adminRepo.updateName(id,newName);
    }

    public void updateMail(int id, String newMail){

        adminRepo.updateMail(id,newMail);
    }

    public void updatePass(int id, String newPass){

        adminRepo.updatePass(id, newPass);
    }

    public void updateStatus(int id, String newStatus){

        adminRepo.updateStatus(id,newStatus);
    }



}
