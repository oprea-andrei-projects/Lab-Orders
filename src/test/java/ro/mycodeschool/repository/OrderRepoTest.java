package ro.mycodeschool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodeschool.model.Order;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void insertOrder_test(){

        Order o = new Order(2, LocalDate.of(2021,9,30),false);
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.insertOrder(o);

    }

    @Test
    void deleteOrder_test(){

        OrderRepo orderRepo = new OrderRepo();
        orderRepo.deleteOrder(7);
    }

    @Test
    void updateuserid_test(){

        OrderRepo orderRepo = new OrderRepo();

        orderRepo.updateUserId(1,4);
    }

    @Test
    void updateIssueDate_test(){

        OrderRepo orderRepo = new OrderRepo();

        orderRepo.updateIssueDate(1,"2000-01-01");
    }

    @Test
    void updateOrderStatus_test(){

        OrderRepo orderRepo = new OrderRepo();

        orderRepo.updateOrderStatus(true,1);


    }

    @Test
    void displayAllOrders_test(){


        OrderRepo orderRepo = new OrderRepo();

        for(Order o: orderRepo.allOrders()){
            System.out.println(o);
        }
    }





}