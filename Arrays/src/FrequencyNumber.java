import java.util.Arrays;

public class FrequencyNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20, 0, 0, 0};
        int[] frequency = new int[arr.length];


        //there is at least 1 of them all.
        for (int i = 0; i < arr.length; i++)
            frequency[i] = 1;


        //Increase repeats.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    frequency[i]++;
                }
            }
        }

        //Including the number 0
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] > 1) {
                if (arr[i] == 0){
                    System.out.println("The Number : " + arr[i] + " was repeated " + frequency[i] + " times.");
                    break;
                }
            }

        }

        //To avoid counting same element again.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] > 1) {
                if (arr[i] != 0)
                    System.out.println("The Number : " + arr[i] + " was repeated " + frequency[i] + " times.");
            }
        }
    }
}
