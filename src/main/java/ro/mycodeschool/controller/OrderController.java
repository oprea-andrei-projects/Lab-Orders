package ro.mycodeschool.controller;

import ro.mycodeschool.model.Order;
import ro.mycodeschool.repository.OrderRepo;

import java.util.List;

public class OrderController {

    private OrderRepo orderRepo;

    public OrderController(){

        orderRepo = new OrderRepo();
    }

    public void insertOrder(Order order){

        orderRepo.insertOrder(order);
    }

    public void deleteOrder(int id){

        orderRepo.deleteOrder(id);
    }

    public void updateUserId(int id, int newUserId){

        orderRepo.updateUserId(id, newUserId);
    }

    public void updateissueDate(int id, String newIssueDate){

        orderRepo.updateIssueDate(id, newIssueDate);
    }

    public void updateOrderStatus(int id, boolean s){

        orderRepo.updateOrderStatus(s,id);
    }

    public List<Order> seeAllOrders(){

       return orderRepo.allOrders();
    }


}
