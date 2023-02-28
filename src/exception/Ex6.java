package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.
        FileSystemAlreadyExistsException;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) throws IOException {


    }
}

class XmlReader {
    private static final Random rnd = new Random();

    public void read() throws IOException {
        switch (rnd.nextInt(3)) {
            case 1:
                throw new
                        NullPointerException();
            case 2:
                throw new Error();
            case 3:
                throw new
                        FileNotFoundException();
            default:
                throw new
                        FileSystemAlreadyExistsException();
        }
    }
}