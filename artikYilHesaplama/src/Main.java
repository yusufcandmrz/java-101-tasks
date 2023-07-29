import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Yıl Giriniz: ");
        year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 == 0){
                System.out.println( year + ", artık yıldır!");
            }
            else if(year % 100 != 0){
                System.out.println( year + ", artık yıldır!");
            }
            else{
                System.out.println( year + ", artık yıl değildir!");
            }
        }
        else{
            System.out.println( year + ", artık yıl değildir!");
        }
    }
}