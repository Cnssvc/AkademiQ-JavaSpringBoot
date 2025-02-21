import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pin = 1234;
        int balance = 300;

        System.out.println("pin kodunu giriniz");
        int girilenPin = scanner.nextInt();
        if (girilenPin != pin) {
            System.out.println("pin kodu hatalı");
        } else {
            System.out.println("giriş başarılı");
        }

        while (true) {
            System.out.println("Atm menüsü");
            System.out.println("1.Bakiye görüntüle");
            System.out.println("2.Para yatır");
            System.out.println("3.Para çek");
            System.out.println("4. çıkış yap");

            int secenek = scanner.nextInt();

            if (secenek == 1) {
                System.out.println("hesap bakiyeniz" + balance);

            } else if (secenek == 2) {
                System.out.println("yatırmak istediğinşz tutarı giriniz");
                int yatirilan = scanner.nextInt();
                if (yatirilan > 0) {
                    balance += yatirilan;
                    System.out.println(yatirilan + "Tl başarı ile yatırıldı");
                } else {
                    System.out.println("geçersiz tutar!");
                }


            } else if (secenek == 3) {
                System.out.println("çekmek istediğiniz tutarı giriniz");
                int cekilen = scanner.nextInt();
                if (cekilen > 0 && cekilen <= balance) {
                    balance -= cekilen;
                    System.out.println(cekilen + "Tl para çekildi");
                } else {
                    System.out.println("yetersiz bakiye veya geçersiz tutar");
                }


            } else if (secenek == 4) {
                System.out.println("çıkış yapılıyor...");
                break;

            } else {
                System.out.println("geçersiz seçim.Tekrar deneyiniz");
            }

        }
        scanner.close();

    }
}
