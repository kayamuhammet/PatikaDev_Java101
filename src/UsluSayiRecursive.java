import java.util.Scanner;

public class UsluSayiRecursive {
    static int usluRec(int taban,int us){
        if(us == 1 || taban == 1){
            return taban;
        }
        return taban * usluRec(taban,us-1);

    }

    public static void main(String[] args) {
        int taban, us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Degerini Giriniz :");
        taban = input.nextInt();
        System.out.print("Us Degerini Giriniz :");
        us = input.nextInt();
        System.out.println(usluRec(taban,us));

    }
}
