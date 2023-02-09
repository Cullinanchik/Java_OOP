package inheritance;

public class CatFamilly {

    protected int legs;
    protected int eyes;
    protected boolean canEatPerson;


    public CatFamilly(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }

    public void eat() {
        System.out.println("Кушаю");
    }
}
