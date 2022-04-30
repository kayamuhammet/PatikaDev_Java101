import java.util.Scanner;

public class AsalSayiRecursive {

    private static int AsalMi(int sayi, int i) {
        if (i==1){
            return 1;
        }
        else {
            if (sayi%i==0){
                return 0;
            }
            else
                return AsalMi(sayi,i-1);
        }
    }

    public static void main(String[] args) {
        int sayi, asal ;
        Scanner input=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        sayi= input.nextInt();

        asal=AsalMi(sayi,sayi/2);

        if (asal==1){
            System.out.println(sayi+" sayisi asaldir");
        }else {
            System.out.println(sayi+" sayisi asal değildir");
        }
    }

}
