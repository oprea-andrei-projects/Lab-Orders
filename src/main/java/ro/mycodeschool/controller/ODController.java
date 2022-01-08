package ro.mycodeschool.controller;

import ro.mycodeschool.model.OrderDetails;
import ro.mycodeschool.repository.ODRepo;

import java.util.List;

public class ODController {

    private ODRepo odRepo;

    public ODController(){

        odRepo = new ODRepo();
    }

    public void insertOdDetails(OrderDetails orderDetails){

        odRepo.insertOD(orderDetails);
    }

    public void deleteOdDetails(int id){

        odRepo.deleteOD(id);
    }

    public void updateOrderID(int id, int newOID){

        odRepo.updateOrderID(id, newOID);
    }

    public void updateM1(int id, int m1){


        odRepo.updateM1(id,m1);
    }

    public void updateM2(int id, int m2){


        odRepo.updateM2(id,m2);
    }

    public void updateM3(int id, int m3){


        odRepo.updateM3(id,m3);
    }

    public List<OrderDetails> allOrderMeasurements(){

        return odRepo.allMes();
    }



}
