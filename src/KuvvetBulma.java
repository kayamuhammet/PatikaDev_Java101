import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        int sayi,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Sinir sayisini giriniz : ");
        sayi = input.nextInt();

        System.out.print("4'un Kuvvetleri\n");
        for(i=1; i<=sayi; i*=4){
            System.out.println(i);
        }

        System.out.print("\n5'in Kuvvetleri");
        for(int j=1; j<=sayi; j*=5){
            System.out.println(j);
        }
    }
}
