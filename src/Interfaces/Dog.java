package Interfaces;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("собачий корм");
    }
    public void run() {
        System.out.println("Собака бежит");
    }
}
