import java.util.Scanner;
import java.util.Arrays;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] list = {56,34,1,8,101,-2,-33};
        int min = list[0];
        int max = list[0];

        System.out.println("Enter a Number : ");
        int sayi = reader.nextInt();
        System.out.println("The Number Entered : " + sayi);


        Arrays.sort(list);

        for(int i : list){
            if(i < sayi){
                min = i;
            }
            if(i > sayi){
                max = i;
                break;
            }
        }


        System.out.println("The nearest number smaller than the entered number : " + min);
        System.out.println("The nearest number greater than the entered number : " + max);
    }
}
