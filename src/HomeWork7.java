import java.util.Scanner;
/*Сможешь ли ты найти иголку в стоге сена?
Напишите функцию findNeedle(), которая принимает array полный мусор, но содержит один "needle"
После того, как ваша функция найдет иглу, она должна вернуть сообщение (в виде строки), в котором говорится:
"found the needle at position " плюс index ит нашел иглу, так что:

Пример (ввод -> Вывод)
["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5" */
public class HomeWork7 {

    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i].equals("needle"))
                break;
            index++;
        }
        return "found the needle at position " + index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        System.out.println(findNeedle(arr));
    }
}
