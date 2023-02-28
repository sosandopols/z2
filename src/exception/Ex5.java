package exception;

import java.io.IOException;
import java.util.Random;
public class Ex5 {
    public static void main(String[] args) throws IOException {
        Runner runner=new Runner();
        try {
            runner.halt();
        }
        catch (RuntimeException e){
            System.out.println("halt");
        }
        catch (IOException e){
            throw new IOException ("это называется подбросить исклечение наверх?");
        }
    }
}

//  пробросить исключение наверх ??
class Runner {
    private static final Random rnd = new Random();
    public void halt() throws IOException {
        if (rnd.nextBoolean()) {
            throw new RuntimeException ();
        }
        else {
            throw new IOException();
        }
    }
}