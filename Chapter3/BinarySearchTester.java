import java.util.Scanner;
import java.util.Arrays;

class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要素数");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("昇順に入力してください。");

        System.out.print("x[0]：");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("探す値：");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0) {
            int insPoint = -idx - 1;
            System.out.println("その値の要素は存在しません。");
            System.out.printf("挿入ポイントは%dです。\n", insPoint);
            System.out.printf("x[%d]の直前に%dを挿入すると配列のソート状態が維持されます。", insPoint, ky);
        } else {
            System.out.println("その値はx[" + idx + "]にあります。");
        }
    }
}