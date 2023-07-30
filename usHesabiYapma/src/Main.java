import java.util.Scanner;

public class Main {
    public static int operation(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * operation(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base;
        int exponent;
        int result;

        System.out.print("Taban Değeri Giriniz: ");
        base = scanner.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        exponent = scanner.nextInt();

        result = operation(base, exponent);

        System.out.print("Sonuç: " + result);
    }
}