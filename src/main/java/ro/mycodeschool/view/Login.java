package ro.mycodeschool.view;

import ro.mycodeschool.controller.PersonController;

import java.util.Scanner;

public class Login {

    private PersonController personController;
    private UserView userView;
    private AdminView adminView;


    public Login(){

        personController = new PersonController();
        userView = new UserView();
        adminView = new AdminView();

    }

    public void meniu(){

        System.out.println("Pentru logare apasati tasta 1 ");
        System.out.println("Petru a iesi apasati tasta 0 ");

    }

    public void play() {

        Scanner scanner = new Scanner(System.in);

        meniu();

        boolean quit = false;

        while(quit==false){

            int alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere){

                case 1:
                    System.out.println("Introduceti mailul: ");
                    String mail = scanner.nextLine();
                    System.out.println("Introduceti parola: ");
                    String pass = scanner.nextLine();
                    if(personController.isInList(mail,pass).equals("user")){
                        System.out.println("Your ID is: " + personController.getID(mail,pass));
                        userView.play();
                    }else if (personController.isInList(mail,pass).equals("admin")){
                        adminView.play();
                    }else {
                        System.out.println("Detaliile userului nu sunt corecte");
                    }
                    meniu();
                    break;

                case 0:
                    quit=true;
                    break;

            }

        }

    }

}
