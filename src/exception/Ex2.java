package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws OppositeException, BigNumberException {
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Write int number!");
        }
        positiveNumber(x);
        bigNumber(x);
    }
    //непроверяемые исключения такие через трай кэтч {System.out.println("Write int number!");}
    // или такие  if(x>100) throw new BigNumberException ("Your number more than 100 ");

    static void positiveNumber(int x) throws OppositeException  {
        if(x<0) throw new OppositeException ("not positive number ");
    }
    static void bigNumber(int x) throws BigNumberException  {
        if(x>100) throw new BigNumberException ("Your number more than 100 ");
    }
}