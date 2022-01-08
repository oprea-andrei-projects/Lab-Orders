package ro.mycodeschool.model;

public class Admin extends Person{



    public Admin(int id, String name, String email, String password, String status) {
        super(id,name, email, password,"admin");

    }

    public Admin(String name, String email, String password) {
        super(name, email, password, "admin");
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
