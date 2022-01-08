package ro.mycodeschool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodeschool.model.OrderDetails;

import static org.junit.jupiter.api.Assertions.*;

class ODRepoTest {

    @Test
    void odInsert_test(){

        ODRepo odRepo = new ODRepo();
        OrderDetails od = new OrderDetails(2,6,14,25);
        odRepo.insertOD(od);
    }

    @Test
    void odDelete(){

        ODRepo odRepo = new ODRepo();
        odRepo.deleteOD(1);
    }

    @Test
    void updateOD(){

        ODRepo odRepo = new ODRepo();

        odRepo.updateOrderID(2,3);
    }

    @Test
    void updateM1_test(){

        ODRepo odRepo = new ODRepo();

        odRepo.updateM1(2,0);
    }

    @Test
    void updateM2_test(){

        ODRepo odRepo = new ODRepo();

        odRepo.updateM2(2,0);
    }

    @Test
    void updateM3_test(){

        ODRepo odRepo = new ODRepo();

        odRepo.updateM3(2,0);
    }

    @Test
    void seeMes_test(){

        ODRepo odRepo = new ODRepo();

        for(OrderDetails od: odRepo.allMes()){
            System.out.println(od);
        }
    }





}