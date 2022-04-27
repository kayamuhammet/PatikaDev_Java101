import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String password;
        String newPassword;
        int select;

        Scanner input = new Scanner(System.in);



        System.out.print("Sifreniz : ");
        password= input.nextLine();

        if(password.equals("123456")){
            System.out.println("Giris Basarili. ");
        }else if(!password.equals("123456")){
            System.out.println("Sifreniz Yanlis ! ");
            System.out.println("Sifrenizi sifirlamak istiyorsaniz 1 yaziniz.");
            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.println("Yeni Sifreniz : " + input.nextLine());
                    newPassword = input.nextLine();
                    if(newPassword.equals("123456")) {
                        System.out.println("Yeni sifre, eski sifre ile ayni olamaz.");
                        break;
                    }else{
                        System.out.println("Sifreniz basariyla degistirildi.");
                        break;
                    }
                case 2:
                    System.out.println("Sifre sifirlama islemi basarisiz ! ");
                    break;

            }
        }
    }
}
