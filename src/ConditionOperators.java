import java.util.Scanner;

public class ConditionOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

    int superviso = scanner.nextInt();
    int proxodnoyGrant = 140;
    int proxodnoyKontrakt = 66;
    if (superviso >= proxodnoyGrant) {
        System.out.println("siz grant asosida talaba bo'ldingiz");
    } else if (superviso >= proxodnoyKontrakt) {
        System.out.println("siz kontrakt talaba bo'ldingiz");
    }else{
        System.out.println("siz talaba bo'la olmadingiz");
    }

    }


}
