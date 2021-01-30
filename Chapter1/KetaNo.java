import java.util.Scanner;

class KetaNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("正の整数の値の桁数を求めます");

        int n;
        do {
            System.out.print("整数値");
            n = stdIn.nextInt();
        } while(n <= 0);
        int no = 0;
        while(n > 0){
            n /= 10;
            no++;
        }
        System.out.println("その数は" + no + "桁です");
    }
}