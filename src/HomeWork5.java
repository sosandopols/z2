import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        For34. Дано целое число N (> 1). Последовательность вещественных чисел AK
        определяется следующим образом:
            A1 = 1,
            A2 = 2,
            AK = (AK−2 + 2·AK−1)/3,
            K = 3, 4, . . . .
        Вывести элементы A1, A2, . . . , AN .
        int n = 10;
        double[] a = new double[n];
        a[0] = 1;
        a[1] = 2;
        for (int i = 2; i < n; i++){
            a[i] = (a[i - 2] + 2 * a[i - 1])/3.;
        }
        System.out.println(Arrays.toString(a));

         */

        /*
        For35. Дано целое число N (> 2). Последовательность целых чисел AK опре-
        деляется следующим образом:
        A1 = 1,
        A2 = 2,
        A3 = 3,
        AK = AK−1 + AK−2 − 2·AK−3,
        K = 4, 5, . . . .
        Вывести элементы A1, A2, . . . , AN .
         */
        int n = 10;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 3; i < n; i++){
            a[i] = a[i - 1] + a[i - 2] - 2 * a[i - 3];
        }
        System.out.println(Arrays.toString(a));
    }
}
