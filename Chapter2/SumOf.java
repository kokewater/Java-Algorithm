import java.util.Scanner;

class SumOf {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return (sum);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要素数は:");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = stdIn.nextInt();
        }
        System.out.println("全要素の合計は" + sumOf(a) + "です。");
    }
}