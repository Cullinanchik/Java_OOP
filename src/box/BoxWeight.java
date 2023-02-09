package box;

public class BoxWeight extends Box{

    private double weight;

    public BoxWeight() {
        this(10);
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Вес коробки: " + weight);
    }
}
