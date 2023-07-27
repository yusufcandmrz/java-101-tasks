import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Formül: Kilo (kg) / Boy(m) * Boy(m)

        double heigth;
        double weigth;
        double bodyMassIndex;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        heigth = scanner.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        weigth = scanner.nextDouble();

        bodyMassIndex = weigth / (heigth * heigth);

        System.out.print("Vücut Kitle İndeksiniz: " + bodyMassIndex);
    }
}