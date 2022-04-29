import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman Sayisini Giriniz : ");
        int value = scan.nextInt();

        int ilkDeger = 0;
        int ikinciDeger = 1;
        System.out.print(ilkDeger + " ");
        System.out.print(ikinciDeger + " ");

        for (int i = 2; i <= value;i++)
        {
            int total = ilkDeger + ikinciDeger;
            ilkDeger = ikinciDeger;
            ikinciDeger = total;
            System.out.print(total + " ");
        }
    }
}
