import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number, int divisor){

        if(number <= 1){
            return false;
        }

        if(divisor == 1){
            return true;
        }

        if(number % divisor == 0){
            return false;
        }

        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        boolean result;

        System.out.print("Sayı Giriniz: ");
        number = scanner.nextInt();

        result = isPrime(number, number-1);

        if(result){
            System.out.println("Asal Sayıdır");
        }
        else{
            System.out.println("Asal Sayı Değildir");
        }
    }
}