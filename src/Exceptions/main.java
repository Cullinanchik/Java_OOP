package Exceptions;

public class main {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            for (int i = 0; i < 12; i++) {
                array[i] = i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Извините, но вы пишите на джава!");
        }
    }
}
