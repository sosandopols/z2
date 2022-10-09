import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*Найдите корни квадратного уравнения и выведите их на
экран, если таковые имеются. Если корней нет, выведите сообщение
, информирующее об этом. Квадратное уравнение определяется
коэффициентами a, b, c, введенными пользователем с клавиатуры.*/
        Scanner scanner = new Scanner(System.in);
        int a, b, c, t;
        double d;
        System.out.println("enter a, b, c");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println((-b + Math.sqrt(d)) / 2 / a);
            System.out.println((-b - Math.sqrt(d)) / 2 / a);
        } else if (d == 0)
            System.out.println((-b / 2 / a));
        else
            System.out.println("NO");
        /*Программа запрашивает шестизначный номер и после
        ввода определяет, будет ли билет с таким номером выигрышным
        (сумма первых трех цифр совпадает с суммой последних трех
        цифр).*/
        System.out.println("enter number of ticket");
        t = scanner.nextInt();
        String s = Integer.toString(t);
        int l = s.length();
        int i, n, left = 0, right = 0;
        for (i = 0; i < l / 2; i++) {
            Character ch = s.charAt(i);
            n = Integer.parseInt(ch.toString());
            left += n;
        }
        for (i = l / 2; i < l; i++) {
            Character ch = s.charAt(i);
            n = Integer.parseInt(ch.toString());
            right += n;
        }
        if (left == right) {
            System.out.println("yes");
        } else
            System.out.println("no");

    }
}
