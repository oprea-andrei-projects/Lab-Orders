package ro.mycodeschool.controller;

import org.junit.jupiter.api.Test;
import ro.mycodeschool.model.Admin;

import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {

    @Test
    void addAdmin_test(){

        AdminController adminController = new AdminController();
        adminController.addAdmin(new Admin("Zoli","zoli@mail.com","passZoli"));


    }

    @Test
    void deleteUser_test(){

        AdminController adminController = new AdminController();
        adminController.deleteAdmin(6);
    }

    @Test
    void updateAdmin_test(){
        AdminController adminController = new AdminController();
        adminController.updateName(8,"Pista");
        adminController.updateMail(8, "pista@mail.com");
        adminController.updatePass(8, "newPass2");
        adminController.updateStatus(8,"user");

    }

}