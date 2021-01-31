import java.util.Scanner;

class Piramid {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("ピラミッドを表示する");
        do {
            System.out.print("段数は");
            n = stdIn.nextInt();
        } while (n <= 0);
        spira(n);
    }
}
