package ro.mycodeschool;

import ro.mycodeschool.model.User;
import ro.mycodeschool.view.AdminView;
import ro.mycodeschool.view.UserView;

public class Application {

    public static void main(String[] args) {

        UserView userView = new UserView();

        userView.seeMesByOrderID();

    }
}
