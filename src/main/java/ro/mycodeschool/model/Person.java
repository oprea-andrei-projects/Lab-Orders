package ro.mycodeschool.model;

public class Person {

    private int id;
    private String name;
    private String email;
    private String password;
    private String status;

    public Person(int id, String name, String email, String password, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public Person(String name, String email, String password, String status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {

        Person person = (Person) obj;

        return this.name== person.name;
    }

    @Override
    public String toString() {

        String text = this.id + " , ";
        text+= this.name + " , ";
        text+= this.email + " , ";
        text+= this.password + " , ";
        text+= this.status ;
        return text;
    }
}
