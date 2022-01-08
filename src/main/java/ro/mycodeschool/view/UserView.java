package ro.mycodeschool.view;

import ro.mycodeschool.controller.ODController;
import ro.mycodeschool.controller.OrderController;
import ro.mycodeschool.model.Order;
import ro.mycodeschool.model.OrderDetails;

import java.time.LocalDate;
import java.util.Scanner;

public class UserView {

    private OrderController oc;
    private ODController od;

    public UserView(){

        oc = new OrderController();
        od = new ODController();
    }

    public void meniu(){

        System.out.println("Comenzile mele -> apasa 1:");
        System.out.println("Introdu o comanda -> apasa 2:");
        System.out.println("Vizualizeaza comanda dupa id-ul tau -> apasa 3:");
        System.out.println("Vizualizeaza masuratorile dupa id-ul comanzii -> apasa 4:");
        System.out.println("Pentru a iesi apasati 0: ");
    }

    public void seeMyOrders(){

        Scanner scanner = new Scanner(System.in);
        int user_id = Integer.parseInt(scanner.nextLine());

          for(int i=0; i<oc.seeAllOrders().size();i++){

              if(oc.seeAllOrders().get(i).getUser_id()==user_id){

                  System.out.println(oc.seeAllOrders().get(i));
              }
          }


    }

    public void insertYourOrder(){


        Scanner scanner = new Scanner(System.in);
        int user_id = Integer.parseInt(scanner.nextLine());
        Order myOrder = new Order(user_id, LocalDate.now(),false);
        oc.insertOrder(myOrder);


    }

    public void seeOrderByUserID(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter you order id:");

        int x = Integer.parseInt(s.nextLine());

        for(int i=0; i<oc.seeAllOrders().size();i++){

            if(oc.seeAllOrders().get(i).getId()==x){

                System.out.println(oc.seeAllOrders().get(i));

            }
        }




    }

    public void seeMesByOrderID(){

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce you order ID:");

        int x = Integer.parseInt(s.nextLine());

        for(int i=0; i<od.allOrderMeasurements().size(); i++){

            if(od.allOrderMeasurements().get(i).getOrder_id()==x){

                System.out.println(od.allOrderMeasurements().get(i));
            }
        }

    }


    public void play(){

        Scanner scanner = new Scanner(System.in);

        meniu();

        boolean quit = false;

        while(quit==false){

            int mychoise = Integer.parseInt(scanner.nextLine());

            switch (mychoise){

                case 1:seeMyOrders();
                break;

                case 2:insertYourOrder();
                break;

                case 3:seeOrderByUserID();
                break;

                case 4:seeMesByOrderID();
                break;

                case 0:
                    quit=true;
                    break;


            }


        }


    }







}
