package exception;

public class Ex3 {
    public static void main(String[] args) throws TriangleException {
        Triangle triangle=new Triangle(3,3,3);

    }
}
class Triangle{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws TriangleException {

        this.a = a;
        this.b = b;
        this.c = c;
        if((a + c  >  b) && (b + c > a) && (a + b > c));
        else throw new   TriangleException("It is Not a Valid Triangle");
    }
}
