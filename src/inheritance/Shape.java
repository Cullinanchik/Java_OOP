package inheritance;

public abstract class Shape {
    private int A;
    private int B;

    public Shape(int a, int b) {
        A = a;
        B = b;
    }

    public final int getA() {
        return A;
    }

    public final int getB() {
        return B;
    }

    public abstract int getPerimetr();

    public final void showPerimetr() {
        System.out.println(getPerimetr());
    }
}
