package ro.mycodeschool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodeschool.model.Admin;

import static org.junit.jupiter.api.Assertions.*;

class AdminRepoTest {

    @Test
    void insertAdmin(){

        AdminRepo adminRepo = new AdminRepo();
        Admin admin = new Admin("bogdan","b@b.com","pass02");

        adminRepo.insertAdmin(admin);
    }

    @Test
    void deleteAdmin(){

        AdminRepo adminRepo = new AdminRepo();
        adminRepo.deleteUser(3);
    }

    @Test
    void updateNameAdmin(){

        AdminRepo adminRepo = new AdminRepo();
        adminRepo.updateName(2,"relu");
    }

    @Test
    void updateMailAdmin(){

        AdminRepo adminRepo = new AdminRepo();
        adminRepo.updateMail(2,"mymail");
    }

    @Test
    void updatePassAdmin(){

        AdminRepo adminRepo = new AdminRepo();
        adminRepo.updatePass(2,"mypass");
    }

    @Test
    void updateStatusAdmin(){

        AdminRepo adminRepo = new AdminRepo();

        adminRepo.updateStatus(4,"user");
    }

}