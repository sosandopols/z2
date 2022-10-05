import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int b, a = 123, h, t, o;
        h = a / 100;
        t = a / 10 % 10;
        o = a % 10;

        b = a % 10 * 100 + a / 100 + a / 10 % 10 * 10;
        System.out.println("1. "+b);

        b = a % 10 * 10 + a / 100 + a / 10 % 10 * 100;
        System.out.println("2. "+b);

        b = a % 10 + a / 100 * 10 + a / 10 % 10 * 100;
        System.out.println("3. "+b);

        if (t % 2 == 0) {
            if (h > o) {
                if (h % 2 != 0) {
                    a = h * 100 + h * 10 + o;
                    System.out.println("4. "+a);
                } else if (o % 2 != 0) {
                    a = h * 100 + o * 10 + o;
                    System.out.println("4. "+a);
                }
            } else {
                if (o % 2 != 0) {
                    a = h * 100 + o * 10 + o;
                    System.out.println("4. "+a);
                } else if (h % 2 != 0) {
                    a = h * 100 + h * 10 + o;
                    System.out.println("4. "+a);
                }
            }
        }

        a = h * 100 + t * 10 + h;
        System.out.println("5. "+a);

        if (t % 2 == 0)
            System.out.println("6. Yes");
        else System.out.println("6. No");

        if (h % 2 != 0)
            System.out.println("7. Yes");
        else System.out.println("7. No");

        Scanner scanner = new Scanner(System.in);
        System.out.print("8. enter number ");
        a = scanner.nextInt();
        if (a / 100 == a % 10)
            System.out.println("Yes");
        else System.out.println("No");

        a = 1234;
        System.out.println("9. "+a / 100 % 10);

        a = 123;
        b = a % 10 * 100 + a / 100 + a / 10 % 10 * 10 - a;
        System.out.println("10. "+b);


        int x1 = 1, y1 = 2, x2 = 3, y2 = 3;
        boolean knight = (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2) || (Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1);
        System.out.println("1. "+knight);

        x1 = 1; y1 = 1; x2 = 2; y2 = 2;
        boolean king = (Math.abs(x2 -x1) == 1 && y1 == y2) || (Math.abs(y2 -y1) == 1 && x1 == x2) || (Math.abs(x2 -x1) == 1 && Math.abs(y2 -y1) == 1);
        System.out.println("2. "+king);

    }
}