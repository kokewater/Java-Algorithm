import java.util.Scanner;

public class Triangle {
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++)
                System.out.print(" ");
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("段数は");
            n = stdIn.nextInt();
        } while (n <= 0);

        System.out.println("左下直角三角形");
        triangleLB(n);

        System.out.println("左上直角三角形");
        triangleLU(n);

        System.out.println("右上直角三角形");
        triangleRU(n);

        System.out.println("右下直角三角形");
        triangleRB(n);
    }
}