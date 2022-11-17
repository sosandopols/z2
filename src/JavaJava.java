import java.util.Scanner;

public class JavaJava {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Ticket ticket = new Ticket();
        ticket.getTicket(s);
    }
}

class Ticket{
    private String t2, t1;
    private int sum;

    public void getTicket(String tick){
        for (int i = 1; i < tick.length(); i++){
            t1 = tick.substring(0, i);
            t2 = tick.substring(i);
            if (sumTicket(t1) == sumTicket(t2)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        return;
    }

    public int sumTicket(String tick) {
        sum = 0;
        for (int i = 0; i < tick.length(); i++)
            sum += Integer.parseInt(String.valueOf(tick.charAt(i)));
        if (sum < 10)
            return sum;
        else
            return sumTicket(String.valueOf(sum));

    }

}
