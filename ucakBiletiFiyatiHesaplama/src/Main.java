import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int distance;
        int age;
        int travelType;
        double totalPrice;
        double firstDiscountPrice;
        double secondDiscountPrice;
        double discountedTotalPrice;
        Scanner scanner = new Scanner(System.in);

        String discounts = "İNDİRİMLER\n" +
                "Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.\n" +
                "Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.\n" +
                "Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.\n" +
                "Kişi yolculuk tipini Gidiş-Dönüş olarak seçerse bilet fiyatı üzerinden %20 indirim uygulanır.";

        System.out.println(discounts);
        System.out.println("***************************************");

        System.out.print("Mesafeyi Kilometre(km) Cinsinden Giriniz: ");
        distance = scanner.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        age = scanner.nextInt();
        System.out.print("Yolculuk Tipini Giriniz (Gidiş(1), Gidiş-Dönüş(2)): ");
        travelType = scanner.nextInt();

        if(distance > 0 && (travelType == 1 || travelType == 2) && age > 0){

                totalPrice = (distance * 0.10);

                if(age < 12){
                    firstDiscountPrice = totalPrice * 0.5;
                }
                else if(age <= 24){
                    firstDiscountPrice = totalPrice * 0.1;
                }
                else if(age > 65){
                    firstDiscountPrice = totalPrice * 0.3;
                }
                else{
                    firstDiscountPrice = totalPrice * 0;
                }

                discountedTotalPrice = totalPrice - firstDiscountPrice;

                if(travelType == 2){
                    secondDiscountPrice = discountedTotalPrice * 0.2;
                    discountedTotalPrice = (discountedTotalPrice - secondDiscountPrice) * 2;
                }

                System.out.println("Toplam Tutar: " + discountedTotalPrice + "TL");
        }
        else{
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
