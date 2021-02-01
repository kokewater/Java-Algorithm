import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    static void swap(int[] a, int idex1, int idex2) {
        int t = a[idex1];
        a[idex1] = a[idex2];
        a[idex2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println(Arrays.toString(a));
            System.out.println("a[" + i + "]とa[" + (a.length - i - 1) + "]を交換します。");
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要素数は?");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }
        reverse(x);
        System.out.println(Arrays.toString(x));
        System.out.println("反転が終了しました。");
    }
}