import java.util.Scanner;
class Difference{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("aの値");
        int a = stdIn.nextInt();

        int b;
        do {
            System.out.print("bの値");
            b = stdIn.nextInt();
        } while(b <= a);
        System.out.println("b-aは" + (b - a) + "です");
    }
}