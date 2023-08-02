public class Main {
    public static void main(String[] args) {
        int[][] array = new int[2][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        int[][] newArray = new int[array[0].length][array.length];

        System.out.println("Matris");
        for(int[] childArray : array){
            for(int number : childArray){
                System.out.print(number + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                newArray[j][i] = array[i][j];
            }
        }

        System.out.println();

        System.out.println("Matris'in Transpozu");
        for(int[] childArray : newArray){
            for(int number : childArray){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}