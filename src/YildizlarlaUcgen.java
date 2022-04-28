import java.util.Scanner;

public class YildizlarlaUcgen {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        sayi = input.nextInt();
        for(int i=0; i<=sayi; i++){
            for (int j=0; j < (sayi-i); j++) {
                System.out.print(" ");
            }
            for (int k=1; k <= (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Tersten yazma
        for(int a=0;a<=sayi;a++){
            for(int l=1;l<a+1;l++){
                System.out.print(" ");
            }

            for(int b=0;b<=2*(sayi-a);b++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
