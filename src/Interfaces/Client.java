package Interfaces;

public class Client {
    void makeOrder(Waiter waiter, String order) {
        waiter.bringOrder(order);
        System.out.println(order);
    }
}
