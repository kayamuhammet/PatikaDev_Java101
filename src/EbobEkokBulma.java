import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        int sayi1,sayi2,ebob=0,max,ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz : ");//24
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");//18
        sayi2 = input.nextInt();

        int i=1;
        while(i < sayi1){
            if(sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("Ebob: " + ebob);
        System.out.println("Ebob: " + ekok);
    }
}
