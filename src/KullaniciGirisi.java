import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = inp.nextLine();

        System.out.print("Şifreniz:");
        password = inp.nextLine();

        if (userName.equals("busra") && password.equals("123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.print("Bilgileriniz Yanlış! Şifrenizi Sıfırlamak İçin evet Yazınız:");
            String options, newPassword;
            options = inp.nextLine();
            if (options.equals("evet")) {
                System.out.println("Yeni Bir Şifre Giriniz:");
                newPassword = inp.next();
                if (newPassword.equals("123")) {
                    System.out.println("Yeni Şifreniz Eski Şifreyle Aynı Olmamalı. Lütfen Tekrar Deneyiniz.");
                } else {
                    System.out.println("Şifreniz Değiştirildi!");
                }
            }

        }

    }
}
