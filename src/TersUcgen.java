import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayisini Giriniz: ");
        int sayi = input.nextInt();


        for (int i=1;i<=sayi;i++){
            for (int k=0;k<=i;k++) {
                System.out.print(" ");
            }
            for (int j=sayi*2-1;j>=i*2-1;j--){
                System.out.print("*");
            }

            System.out.println(" ");

        }
    }
}
