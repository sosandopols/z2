import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
         /* Task 3

        for (int i = 0; i<1e6; i++){
            double sum = 0;
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                Character c = s.charAt(j);
                int d = Integer.parseInt(c.toString());
                sum += Math.pow (d, s.length());
            }
            if (sum == i)
                System.out.println(i);
        }
         */

        //Task 5

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int n1 = Integer.parseInt(s);
        sb.reverse();
        int n2 = Integer.parseInt(sb.toString());
        if (n1 == n2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
