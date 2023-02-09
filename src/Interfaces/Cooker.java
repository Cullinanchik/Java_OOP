package Interfaces;

public class Cooker implements Worker, Driver{
    @Override
    public void drive() {
        System.out.println("Езжу на фокусе, йопть");
    }

    @Override
    public void work() {
        System.out.println("Работаю йопт, поваром:3");
    }
}
