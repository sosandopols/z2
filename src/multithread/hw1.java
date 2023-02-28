package multithread;

import java.util.Arrays;
import java.util.Random;

public class hw1 {
    /*При старте приложения запускаются три потока.
    Первый поток заполняет массив случайными числами.
    Два других потока ожидают заполнения. Когда массив
    заполнен оба потока запускаются. Первый поток находит
    сумму элементов массива, второй поток среднеарифметическое значение в массиве. Полученный массив, сумма
    и среднеарифметическое возвращаются в метод main,
    где должны быть отображены. */
    static int[] arr = new int[1000];
    public static void main(String[] args) {
        Gen gen=new Gen();
        Sum sum=new Sum();
        Average average=new Average();
        Thread thread1=new Thread(gen);
        Thread thread2=new Thread(sum);
        Thread thread3=new Thread(average);
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        thread3.start();


    }
    static  class Gen implements Runnable {
        Random random=new Random();
        @Override
        public void run() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1, 1000);
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    static  class Sum  implements Runnable {
        int sum=0;
        @Override
        public void run() {
            for (int i = 0; i < arr.length; i++) sum+=arr[i];
            System.out.println("sum="+sum);
        }
    }


    static  class Average implements Runnable {
        int average=0;
        int n=0;
        @Override
        public void run() {
            for (int i = 0; i < arr.length; i++) {
                average+=arr[i];
                n++;
            }
            System.out.println("average=" +average/n);

        }
    }
}

