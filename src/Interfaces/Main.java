package Interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//        for (Animal animal: animals) {
////            animal.eat();
//        }
//        Animal animal = new Dog();
//        animal.eat();
//        Dog dog = (Dog) animal;
//        dog.run();
//        Director director = new Director();
//        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
//        director.force(softwareEngineer);

        Client client = new Client();
        Waiter waiterVladislav = new WaiterVladislav();
        client.makeOrder(waiterVladislav, "Pizza");
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String order) {

            }
        }, "Sushi");

    }
}
