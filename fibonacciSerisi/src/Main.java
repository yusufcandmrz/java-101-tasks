import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numbers;
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman Sayısını Giriniz: ");
        numbers = scanner.nextInt();

        if(numbers <= 2){
            System.out.println("Lütfen 2'den Büyük Bir Sayı Giriniz");
        }
        else{
            System.out.print("Fibonacci Serisi: " + firstValue + " - " + secondValue);
            for(int i = 2; i < numbers; i++){
                thirdValue = firstValue + secondValue;
                System.out.print(" - " + thirdValue);
                firstValue = secondValue;
                secondValue = thirdValue;
            }
        }
    }
}