package ro.mycodeschool.model;

public class User extends Person{



    public User(int id, String name, String email, String password, String status){
        super(id,name, email, password,"user");
    }

    public User(String name, String email, String password, String status) {
        super(name, email, password, "user");
    }

    public User() {
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
