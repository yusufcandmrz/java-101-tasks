import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int birthYear;
        int monthNumber;
        String chinaZodiac = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Tarihini Giriniz: ");
        birthYear = scanner.nextInt();
        monthNumber = birthYear%12;

        switch (monthNumber) {
            case 0 -> chinaZodiac = "Maymun";
            case 1 -> chinaZodiac = "Horoz";
            case 2 -> chinaZodiac = "Köpek";
            case 3 -> chinaZodiac = "Domuz";
            case 4 -> chinaZodiac = "Fare";
            case 5 -> chinaZodiac = "Öküz";
            case 6 -> chinaZodiac = "Kaplan";
            case 7 -> chinaZodiac = "Tavşan";
            case 8 -> chinaZodiac = "Ejderha";
            case 9 -> chinaZodiac = "Yılan";
            case 10 -> chinaZodiac = "At";
            case 11 -> chinaZodiac = "Koyun";
            default -> System.out.println("Hata!");
        }

        System.out.print("Çin Zodyağı Burcunuz: " + chinaZodiac);
    }
}