import java.util.Scanner;

public class Main {

    public static void operation(int number, int processedNumber, boolean down){

        System.out.print(processedNumber + " ");
        int tempNumber;

         if(down){
             tempNumber = processedNumber - 5;
             if(tempNumber >= 0){
                 operation(number, tempNumber, true);
             }
             else{
                 operation(number, tempNumber, false);
             }
         }
         else{
             tempNumber = processedNumber + 5;
             if(number == processedNumber){
                 return;
             }
             else{
                 operation(number, tempNumber, false);
             }
         }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Pozitif Bir Tam Sayı Giriniz: ");
        number = scanner.nextInt();

        if(number <= 0){
            System.out.println("Lütfen Pozitif Tam Sayı Giriniz");
        }
        else{
            operation(number, number, true);
        }
    }
}