import java.util.Random;

public class Kubik {

    private static int result;

    public static int getResult() {
        return result;
    }

    public Kubik(int result) {
        result = 0;
    }

    @Override
    public String toString() {
        return String.format("Ваше число %d", result);
    }


}
