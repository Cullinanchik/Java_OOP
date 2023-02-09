import inheritance.Cat;
import inheritance.Lion;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Human human_1 = new Human();
//        Human human_2 = new Human();
//        Human human_3 = new Human();
//
//        human_1.age = 20;
//        human_1.name = "Ilya";
//        human_1.weight = 65;
//
//        human_2.age = 20;
//        human_2.name = "Vladislav";
//        human_2.weight = 110;
//
//        human_3.age = 30;
//        human_3.name = "Vladislav";
//        human_3.weight = 64;
//
//        int average = (human_1.age + human_2.age + human_3.age) / 3;
//        System.out.println(average);

//        Dog dog = new Dog();
//        dog.name = "Bessi";
//        dog.poroda = "Scottish Terrier";
//        dog.weight = 20;
//        System.out.println(dog.getInfo());
//
//        dog.speed = 5;
//        dog.run();

//        Rectangle rectangle = new Rectangle();
//        rectangle.setRect(20,20);
//        System.out.println(rectangle.getArea());

//        Monster monster_1 = new Monster(5,5,5);
//        monster_1.voice();
//        monster_1.voice(5);
//        monster_1.voice(4, "JAVA лучше котлина!!!");

//        box.Box currentBox = new box.Box(30);
//        box.Box anotherBox = new box.Box(20);
//        System.out.println(currentBox.compare(anotherBox));


//        ArrayList<String> names = new ArrayList<>();
//        names.add("Ilya");
//        names.add("Andrey");
//        names.add("Evgeniy");
//        names.add("Hook");
//        names.add("Vladislav");
//
//        ArrayList<Integer> ints = new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            ints.add(i);
//        }
//
//        ArrayList<String> result = new ArrayList<>();
//        for (int i = 0; i < names.size(); i++) {
//            result.add(ints.get(i) + " - " + names.get(i));
//        }
//        for (String output:result) {
//            System.out.println(output);
//        }

//        Cat cat = new Cat();
//        Lion lion = new Lion();
//
//        cat.eat();
//        lion.eat();


        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(1,7);
            String result = String.format("Ваше число: %s", a);
            System.out.println(result);
        }

    }

}
