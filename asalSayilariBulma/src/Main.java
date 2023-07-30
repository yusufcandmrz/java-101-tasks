public class Main {
    public static void main(String[] args) {

        int sumOfDivisors = 0;

        System.out.println("1-100 Arasındaki Asal Sayılar");
        for(int i = 2; i < 100; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    sumOfDivisors += j;
                }
            }
            if(sumOfDivisors == 0){
                System.out.print(i + ", ");
            }
            sumOfDivisors = 0;
        }
    }
}