package ro.mycodeschool.repository;

import ro.mycodeschool.model.User;

public class UserRepo extends SQL{

    public UserRepo(){
        super();
    }

    public void insertUser(User user){

        String deInserat = String.format("insert into laborders.users(name,email,password,status)" +
                "values('%s','%s','%s','%s')",user.getName(),user.getEmail(),user.getPassword(),user.getStatus());
        executeStatement(deInserat);

    }

    public void deleteUser(int id){

        String deSters = String.format("delete from laborders.users where id=%d",id);

        executeStatement(deSters);
    }

    public void updateName(int id, String newName){

        String nameUpdate = String.format("update laborders.users set name='%s' where id=%d",newName,id);

        executeStatement(nameUpdate);
    }

    public void updateMail(int id, String newMail){

        String mailUpdate = String.format("update laborders.users set email='%s' where id=%d",newMail,id);

        executeStatement(mailUpdate);
    }

    public void updatePass(int id, String newPass){

        String passUpdate = String.format("update laborders.users set password='%s' where id=%d",newPass,id);

        executeStatement(passUpdate);
    }

}
