import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double pearWeigth;
        double appleWeigth;
        double tomatoWeigth;
        double bananaWeigth;
        double aubergineWeigth;
        double totalPrice;

        String fruitPrices = "Meyveler ve KG Fiyatları\n"+
                "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL\n";

        System.out.println(fruitPrices);
        System.out.print("Kaç kilo armut alacaksınız? ");
        pearWeigth = scanner.nextDouble();
        System.out.print("Kaç kilo elma alacaksınız? ");
        appleWeigth = scanner.nextDouble();
        System.out.print("Kaç kilo domates alacaksınız? ");
        tomatoWeigth = scanner.nextDouble();
        System.out.print("Kaç kilo muz alacaksınız? ");
        bananaWeigth = scanner.nextDouble();
        System.out.print("Kaç kilo patlıcan alacaksınız? ");
        aubergineWeigth = scanner.nextDouble();

        totalPrice = (pearWeigth * 2.14) + (appleWeigth * 3.67) + (tomatoWeigth * 1.11) + (bananaWeigth * 0.95) + (aubergineWeigth * 5.00);
        String formattedTotalPrice = decimalFormat.format(totalPrice);

        System.out.print("Toplam Tutarınız: " + formattedTotalPrice);
    }
}