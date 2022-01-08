package ro.mycodeschool.repository;

import ro.mycodeschool.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonRepo extends SQL{

    public PersonRepo(){

        super();
    }

    public ResultSet seeAllPersons(){

        String allP = String.format("select * from laborders.users");

        executeStatement(allP);

        try{

            return statement.getResultSet();

        }catch(SQLException e){

            e.printStackTrace();
            return null;
        }
    }

    public List<User> allUsers(){

        ResultSet rs = seeAllPersons();
        List<User>myList = new ArrayList<>();

        try{
            while(rs.next()){

                myList.add(new User(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getString(4),rs.getString(5)));

            }


        }catch(Exception e){

            e.printStackTrace();
        }

        return myList;
    }


}
