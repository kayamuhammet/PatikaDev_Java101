import java.util.Scanner;

public class RecursiveDesen {

    static void cikarma(int sayi,int temp){
        System.out.print(temp+" ");
        if (temp <= 0){
            ekleme(sayi, temp+5);
        }
        else{
            cikarma(sayi, temp-5);
        }
    }
    static void ekleme(int sayi, int temp){
        System.out.print(temp + " ");
        if (sayi == temp)
            return;
        else{
            ekleme(sayi, temp+5);
        }
    }



    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("N degerini giriniz :");
        sayi = input.nextInt();
        cikarma(sayi, sayi);



    }
}
