package Interfaces;

public class WaiterVladislav implements Waiter{
    @Override
    public void bringOrder(String order) {
        System.out.println("Я вам принес " + order);
    }
}
