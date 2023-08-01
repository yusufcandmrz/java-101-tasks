public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25, 10, 15, 15, 20, 20, 25, 20, 25, 25};

        System.out.print("Dizi: ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();

        int[] distinctNumbers = new int[numbers.length];
        int[] frequencies = new int[numbers.length];

        int distinctCount = 0;

        for (int number : numbers) {
            boolean isDistinct = true;

            for (int j = 0; j < distinctCount; j++) {
                if (distinctNumbers[j] == number) {
                    frequencies[j]++;
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                distinctNumbers[distinctCount] = number;
                frequencies[distinctCount] = 1;
                distinctCount++;
            }
        }

        for (int i = 0; i < distinctCount; i++) {
            System.out.println(distinctNumbers[i] + " elemanı " + frequencies[i] + " kez tekrar edildi.");
        }
    }
}
