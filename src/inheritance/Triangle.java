package inheritance;

public class Triangle extends Shape{
    private int C;

    public Triangle() {
        super(10,20);
        C = 30;
    }


    public int getC() {
        return C;
    }

    @Override
    public int getPerimetr() {
        return getA() + getB() +getC();
    }


}
