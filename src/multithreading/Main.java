package multithreading;

import java.util.Random;

public class Main {
    static boolean isFive = false;
    static boolean isCorrect = true;
    public static void main(String[] args) {

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000_000; i++) {
//                    if (i == 5) {
//                        isFive = true;
//                    }
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                    }
//                }
//            }
//        });
//        thread.start();
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000_000; i++) {
//                    if (isFive) {
//                        break;
//                    }
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                    }
//                }
//            }
//        });
//        thread2.start();
        Random random = new Random();
        int correct_number = random.nextInt(1, 100_000_000_0);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
              while (isCorrect) {
                  int number = random.nextInt(1, 100_000_000_0);
                  if (number == correct_number) {
                      isCorrect = false;
                      System.out.println("Я угадал ваше число!");
                  }
              }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if (!isCorrect) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread2.start();

    }
}
