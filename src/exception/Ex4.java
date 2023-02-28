package exception;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) throws SortArrayException {
        int[] array1 = {31, 1, 0, 13,67,17,83,53,41,8,25,37,2};
        //  Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        sortArray(array1);
    }
    static void sortArray(int[] array) throws SortArrayException  {
        int arr[] =array;
        Arrays.sort(arr);
        if( array.equals(arr) )throw new SortArrayException ("Array not sorted ");
    }
}
