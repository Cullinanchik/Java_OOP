package inheritance;

public class Rectangle extends Shape{

    public Rectangle() {
        super(10,10);
    }

    @Override
    public int getPerimetr() {
        return (getA() + getB()) * 2;
    }
}
