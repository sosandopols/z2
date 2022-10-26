import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        /* Task 1
        int size = 15;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < size; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
         */
        /* Task 2
        int size = 30, min = 51, max = -71;
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(-70, 51);
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
         */


    }
}
