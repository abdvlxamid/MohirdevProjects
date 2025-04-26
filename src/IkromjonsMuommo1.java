import java.util.Scanner;

public class IkromjonsMuommo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            if (a / b != 0) {
                int c = a - b;
                int d = b / c;
                if (d != 0) {
                    System.out.println("EKUB = " + c);
                }
            }
        } else if (b > a) {
            if (b / a != 0) {
                int c = b - a;
                int d = a / c;
                if (d != 0) {
                    System.out.println("EKUB = " + c);
                }
            }
        } else {
            System.out.println("siz notog'ri son kiritingiz!");
        }
    }
}
