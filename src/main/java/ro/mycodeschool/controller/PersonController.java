package ro.mycodeschool.controller;

import ro.mycodeschool.repository.PersonRepo;

public class PersonController {

    private PersonRepo personRepo;

    public PersonController(){

        personRepo = new PersonRepo();
    }

    public String isInList(String mail, String passord){

        for(int i=0; i<personRepo.allUsers().size(); i++){

            if(personRepo.allUsers().get(i).getEmail().equals(mail)&&personRepo.allUsers().get(i).getPassword().equals(passord)){

                return personRepo.allUsers().get(i).getStatus();
            }

        }
        return "";
    }

    public int getID(String mail, String passord){

        for(int i=0; i<personRepo.allUsers().size(); i++){

            if(personRepo.allUsers().get(i).getEmail().equals(mail)&&personRepo.allUsers().get(i).getPassword().equals(passord)){

                return personRepo.allUsers().get(i).getId();
            }

        }
        return -1;

    }
}
