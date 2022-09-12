import java.util.Arrays;
import java.util.Scanner;

public class SortInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp=0;
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        System.out.println("The size of the array : " + size);


        if(size>0){
            int[] arr = new int[size];

            for(int i = 0; i<size; i++){
                System.out.print("Enter the " + (i+1) + ". element : ");
                arr[i]  = input.nextInt();
            }
            System.out.println("Unsorted Array : " + Arrays.toString(arr));


            for(int i=0; i<size; i++){
                for(int j = i + 1; j<size; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Sorted Array : " + Arrays.toString(arr));







        }


    }
}
