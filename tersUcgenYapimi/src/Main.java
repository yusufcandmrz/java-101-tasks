import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rowCount;
        int excess = 1;

        System.out.print("Satır Sayısını Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        rowCount = scanner.nextInt();

        for(int i = 1; i <= rowCount; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= ( rowCount * 2 - excess ); k++){
                System.out.print("*");
            }
            excess += 2;
            System.out.print("\n");
        }
    }
}