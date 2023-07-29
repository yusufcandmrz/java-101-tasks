import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        int inputNumber;

        while(true){
            int sumOfDivisors = 0;
            System.out.println("***********************");
            System.out.println("Çıkış için Q'ya basınız.");
            System.out.print("Sayı giriniz: ");
            input = scanner.nextLine();

            if(input.equalsIgnoreCase("Q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            inputNumber = Integer.parseInt(input);

            if (inputNumber < 1){
                System.out.println("Pozitif tam sayı giriniz...");
                continue;
            }

            for(int i = 1; i < inputNumber; i++){
                if(inputNumber % i == 0){
                    sumOfDivisors += i;
                }
            }

            if(sumOfDivisors == inputNumber){
                System.out.println(inputNumber + ", mükemmel sayıdır.");
            }
            else{
                System.out.println(inputNumber + ", mükemmel sayı değildir.");
            }
        }
    }
}