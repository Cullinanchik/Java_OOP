public class Dog {
    String name;
    String poroda;
    int weight;

    int speed;

    String getInfo() {
        return "Эту собачку зовут: " + name + " порода: " + poroda + " ее вес равен: " + weight;
    }

    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }
    }
}
