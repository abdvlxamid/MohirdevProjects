import java.util.Scanner;

public class IkromjonMuommosi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();


        if(n > k){
            //n = 17
            //k = 3


            int qoldiq = n%k;
            if(qoldiq != 0){
                int qoldiqsiz_bolinuvchi = n - qoldiq;
                int bolinuvchi = qoldiqsiz_bolinuvchi / k;
                System.out.println("Javob:"+ n + "=" + bolinuvchi + "*" + k + "+" + qoldiq );
            }
        }
    }
}
