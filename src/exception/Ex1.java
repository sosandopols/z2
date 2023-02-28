package exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int n= random.nextInt(1,10);
        int arr[] = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= random.nextInt(-10,10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x = 0;
        try{
             x=scanner.nextInt();
        }
        catch(InputMismatchException e ){
            System.out.println("Write int number!");
        }
    int del;
        for(int i=0;i< arr.length;i++){
            try {
                del=arr[i]/x;
                System.out.print(del+" ");
            }
           catch (ArithmeticException e){
               System.out.println("You dividing by zero!");
               return;
           }
        }
    }
}

