package Interfaces;

public class SoftwareEngineer implements Worker, Driver{
    @Override
    public void drive() {
        System.out.println("Езжу на кулинане, йопть");
    }

    @Override
    public void work() {
        System.out.println("Работаю йопта прогером:3");
    }
}
