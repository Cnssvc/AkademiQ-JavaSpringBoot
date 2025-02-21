import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        /*5: Restoran Sipariş Sistemi (Switch-Case, Do-While)

        Senaryo:

        Bir restoran sipariş sistemi, kullanıcının menüden yemek seçmesini ve hesaplama yapmasını sağlar.

                İşleyiş:
	•	Kullanıcı, menüdeki yemekleri switch-case kullanarak seçer.
	•	Her yemek için belirlenen bir fiyat vardır.
	•	Kullanıcı birden fazla yemek seçebilir, sipariş tamamlanana kadar sistem çalışmalıdır (do-while döngüsü ile)
	•	Sipariş tamamlandığında, toplam hesap ekrana yazdırılmalıdır.*/

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int choice;
        boolean devamEt = true;

        System.out.println("restoran sipariş sistemi");
        System.out.println("1.makarna 10 Tl");
        System.out.println("2. salata 5 Tl");
        System.out.println("3. pilav 4 Tl");
        System.out.println("4.hamnurher 6 Tl");
        System.out.println("5.çıkış");
        do {
            System.out.println("1 ile 5 arası numara seçin");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("makarna seçildi.fiyatı:10Tl");
                    total += 10;
                    break;
                case 2:
                    System.out.println("salata seçildi.fiyatı:5Tl");
                    total += 5;
                    break;
                case 3:
                    System.out.println("pilav seçtiniz.fiyatı 4Tl");
                    total += 4;
                    break;
                case 4:
                    System.out.println("hamburgeri seçtiniz.fiyatı 6Tl");
                    total += 6;
                    break;
                case 5:
                    System.out.println("siparişiniz tamamlandı");
                    devamEt = false;
                    break;
                default:
                    System.out.println("geçersiz seçim.1 ile 5 arası bir rakam giriniz");


            }
            if (devamEt) {
                System.out.println("başka bir yemek seçmek ister misiniz evet=1 ya da hayır=2");
                int dvm = scanner.nextInt();
                if (dvm == 2) {
                    devamEt = false;
                    System.out.println("sipariş tamamlandı");

                }
            }
        }
        while (devamEt);
        System.out.println("toplam hesap:" + total + "Tl");
        scanner.close();


    }
}
