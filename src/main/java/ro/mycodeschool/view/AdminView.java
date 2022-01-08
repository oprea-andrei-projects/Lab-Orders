package ro.mycodeschool.view;

import ro.mycodeschool.controller.ODController;
import ro.mycodeschool.controller.OrderController;
import ro.mycodeschool.controller.UserController;
import ro.mycodeschool.model.Order;
import ro.mycodeschool.model.OrderDetails;

import java.util.Scanner;

public class AdminView {

    private UserController userController;
    private OrderController orderController;
    private ODController odController;


    public AdminView(){

        userController=new UserController();
        orderController=new OrderController();
        odController=new ODController();
    }

    public void meniu(){


        System.out.println("Display all orders -> press 1");
        System.out.println("Display order measurements -> press 2");
        System.out.println("Delete order -> press 3");
        System.out.println("Update Order -> press 4");
        System.out.println("Performe Measurements -> press 5");
        System.out.println("Pentru a iesi apasati 0: ");
    }

    public void displayAllOrders(){

        for(Order o: orderController.seeAllOrders()){
            System.out.println(o);
        }


    }

    public void displayOrderMeasurements(){
        System.out.println("Introduce order ID");

        Scanner s = new Scanner(System.in);

        int x = Integer.parseInt(s.nextLine());

        for(int i=0; i<odController.allOrderMeasurements().size(); i++){

            if(odController.allOrderMeasurements().get(i).getOrder_id()==x){

                System.out.println(odController.allOrderMeasurements().get(i));
            }else{

                System.out.println("orderul nu este in sistem !");
            }
        }
    }

    public void deleteOrder(){

        System.out.println("Enter order id;");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        orderController.deleteOrder(x);
    }

    public void updateOrder(){

        System.out.println("If you want to update user_id press 1:");
        System.out.println("If you want to update issue date press 2:");

        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        if(x==1){

            System.out.println("Enter order id :");

            int y = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter new user id: ");

            int z = Integer.parseInt(scanner.nextLine());

            orderController.updateUserId(y,z);

        } else if(x==2){

            System.out.println("Enter order id :");

            int y = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter new issue date: ");

            System.out.println("Enter year:");

            String a = scanner.nextLine();

            System.out.println("Enter month:");

           String b = scanner.nextLine();

            System.out.println("Enter day of month:");

            String c = scanner.nextLine();

            orderController.updateissueDate(y,a+"-"+b+"-"+c);

        }




    }

    public void insertMyOD(){

        System.out.println("Introduce order number:");
        Scanner s = new Scanner(System.in);
        int x= Integer.parseInt(s.nextLine());

        odController.insertOdDetails(new OrderDetails(x,0,0,0));
    }

    public void perform_measurements(){

        insertMyOD();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter order_details id number:");

        int a = Integer.parseInt(scanner.nextLine());



        System.out.println("Enter value for the first measurement: ");

        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter value for the second measurement: ");

        int y = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter value for the third measurement: ");

        int z = Integer.parseInt(scanner.nextLine());
        odController.updateM1(a,x);
        odController.updateM2(a,y);
        odController.updateM3(a,z);
        orderController.updateOrderStatus(a,true);

    }

    public void play(){

        Scanner scanner = new Scanner(System.in);

        meniu();

        boolean quit = false;

        while(quit==false){

            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise){

                case 1:displayAllOrders();
                break;

                case 2:displayOrderMeasurements();
                break;

                case 3:deleteOrder();
                break;

                case 4:updateOrder();
                break;

                case 5:perform_measurements();
                break;

                case 0:
                    quit=true;
                    break;
            }

        }


    }





}
