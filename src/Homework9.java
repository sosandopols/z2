public class Homework9 {
    public static void main(String[] args) {
        int n = 5;
        Pattern17(n);
        System.out.println();
        Pattern18(n);
        System.out.println();
        Pattern19(n);

    }

    static void Pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n - i + j);
            }
            System.out.println();
        }
    }
    static void Pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n - i + j + " ");
            }
            System.out.println();
        }
    }
    static void Pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n - i + j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
        }
    }
}
