package box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        BoxWeight boxWeight = new BoxWeight(20, 10);
        box.ShowInfo();
        boxWeight.ShowInfo();
    }
}
