import java.util.Scanner;

public class Main {

    public static void arraySort(int[] numbers) {

        int tempNumber;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    tempNumber = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempNumber;
                }
            }
        }

        System.out.print("Dizinin Sıralaması: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }


    public static void main(String[] args) {

        int[] numbers;
        int number;
        int arrayLength;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi Kaç Elemanlı Olacak? ");
        arrayLength = scanner.nextInt();
        numbers = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++){
            System.out.print("Eklemek İstediğiniz Sayıyı Giriniz: ");
            number = scanner.nextInt();
            numbers[i] = number;
        }

        arraySort(numbers);
    }
}