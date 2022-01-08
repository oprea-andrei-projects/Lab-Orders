package ro.mycodeschool.repository;

import ro.mycodeschool.model.Order;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRepo extends SQL{

    public OrderRepo(){
        super();

    }

    public void insertOrder(Order o){

        String deInserat = String.format("insert into laborders.orders(user_id,issue_date,order_status)" +
                "values(%d,'%s',%s)",o.getUser_id(),o.getIssue_date(),o.isOrder_status());

        executeStatement(deInserat);

    }

    public void deleteOrder(int id){

        String deSters = String.format("delete from laborders.orders where id=%d",id);

        executeStatement(deSters);

    }

    public void updateUserId(int id , int newUserId){

        String useridUpdate = String.format("update laborders.orders set user_id=%d where id=%d",newUserId,id);

        executeStatement(useridUpdate);
    }

    public void updateIssueDate(int id, String newDate){

        LocalDate ld = LocalDate.of(Integer.parseInt(newDate.split("-")[0]),
                Integer.parseInt(newDate.split("-")[1]),
                Integer.parseInt(newDate.split("-")[2]));

        String dateUpdate = String.format("update laborders.orders set issue_date='%s' where id=%d",ld,id);

        executeStatement(dateUpdate);
    }

    public void updateOrderStatus(boolean s, int id){


        String statusUpdate = String.format("update laborders.orders set order_status=%s where id=%d",s,id);

        executeStatement(statusUpdate);


    }

    public ResultSet seeAllOrders(){

        String allOrders = String.format("select * from laborders.orders");

        executeStatement(allOrders);

        try {
            return statement.getResultSet();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Order>allOrders(){

        ResultSet rs = seeAllOrders();
        List<Order>list = new ArrayList<>();

        try{

            while(rs.next()){

                list.add(new Order(rs.getInt(1),rs.getInt(2),
                        rs.getDate(3).toLocalDate(),rs.getBoolean(4)));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;

    }

}
