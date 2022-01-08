package ro.mycodeschool.repository;

import ro.mycodeschool.model.OrderDetails;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ODRepo extends SQL{

    public ODRepo(){
        super();
    }

    public void insertOD(OrderDetails od){

        String deInserat = String.format("insert into laborders.order_detais(o_id,m1,m2,m3) " +
                "values(%d,%d,%d,%d)",od.getOrder_id(),od.getM1(),od.getM2(),od.getM3());

        executeStatement(deInserat);

    }

    public void deleteOD(int id){

        String deSters = String.format("delete from laborders.order_detais where id=%d",id);

        executeStatement(deSters);

    }

    public void updateOrderID(int id, int newOID){

        String oidUpdate = String.format("update laborders.order_detais set o_id=%d where id=%d",newOID,id);

        executeStatement(oidUpdate);


    }

    public void updateM1(int id, int newValue){

        String mUpdate = String.format("update laborders.order_detais set m1=%d where id=%d",newValue,id);

        executeStatement(mUpdate);
    }

    public void updateM2(int id, int newValue){

        String mUpdate = String.format("update laborders.order_detais set m2=%d where id=%d",newValue,id);

        executeStatement(mUpdate);
    }

    public void updateM3(int id, int newValue){

        String mUpdate = String.format("update laborders.order_detais set m3=%d where id=%d",newValue,id);

        executeStatement(mUpdate);
    }

    public ResultSet seeAllMeasurements(){

        String deSelectat = String.format("select * from laborders.order_detais");

        executeStatement(deSelectat);

        try{

            return statement.getResultSet();

        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    public List<OrderDetails> allMes(){

        ResultSet rs = seeAllMeasurements();
        List<OrderDetails>list = new ArrayList<>();

        try{
            while (rs.next()){

                list.add(new OrderDetails(rs.getInt(1),rs.getInt(2),
                        rs.getInt(3),rs.getInt(4),rs.getInt(5)));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return list;

    }
}
