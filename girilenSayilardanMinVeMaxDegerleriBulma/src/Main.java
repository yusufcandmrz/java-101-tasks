import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalNumbers;
        int number;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        System.out.print("Kaç Tane Sayı Gireceksiniz? ");
        totalNumbers = scanner.nextInt();

        if(totalNumbers <= 1){
            System.out.println("Hatalı Girdi! Kıyaslama Yapılabilmesi İçin En Az 2 Sayı Girmelisiniz.");
            return;
        }

        for(int i = 1; i <= totalNumbers; i++){
            System.out.print(i + ". Sayıyı Giriniz: ");
            number = scanner.nextInt();

            if(number > maxNumber){
                maxNumber = number;
            }

            if(number < minNumber){
                minNumber = number;
            }
        }

        System.out.println("Girilen En Küçük Sayı: " + minNumber);
        System.out.println("Girilen En Büyük Sayı: " + maxNumber);
    }
}