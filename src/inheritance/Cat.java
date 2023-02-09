package inheritance;

public class Cat extends CatFamilly{
    public Cat() {
        super(4,2,false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("рыбку:3");
    }
}
