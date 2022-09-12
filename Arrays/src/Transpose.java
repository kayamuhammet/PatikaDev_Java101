import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner input = new Scanner(System.in);

        // Getting input from the user.
        for (int i = 0; i< 2; i++) {
            for (int j=0; j< 3; j++){
                System.out.print("[" + i + "]" + "[" + j + "]" +  " Matrix : ");
                arr[i][j]  =input.nextInt();
            }
        }

        System.out.println("Original Matrix : ");
        for(int[] u : arr){
            System.out.println(Arrays.toString(u));
        }

        // transpose operations
        int[][] arr1 = new int[3][2];
        for (int i = 0; i< 2; i++) {
            for (int j=0; j< 3; j++){
                arr1[j][i]  = arr[i][j];
            }
        }

        System.out.println("Transposed Matrix");
        for(int[] d : arr1){
            System.out.println(Arrays.toString(d));
        }

    }
}
