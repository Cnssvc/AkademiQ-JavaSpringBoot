import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        /*ÖDEV 2: Market Kasa Programı (For, If-Else, Switch-Case)

        Senaryo:

        Bir market kasasında, müşteri ürünleri tarattıkça toplam fiyat hesaplanır. Kullanıcı, markette 3 farklı ürün arasından seçim yapabilir ve alışveriş bitene kadar devam eder.

                İşleyiş:
	•	Kullanıcı, bir ürün seçmek için switch-case kullanır.
	•	Kullanıcı her ürün seçtiğinde, ürünün fiyatı toplam tutara eklenir.
	•	Kullanıcı “0” girerse alışveriş tamamlanır ve toplam fiyat ekrana yazdırılır.
	•	Kullanıcı indirim kuponu girerse, %10 indirim uygulanır.*/
        Scanner scanner = new Scanner(System.in);

        int secenek;
        double total = 0;
        char coupon;

        System.out.println("Market Kasa Programı");
        System.out.println("1.su 5 Tl");
        System.out.println("2.ekmek 3 Tl");
        System.out.println("3.cikolata 2");
        System.out.println("alışverişi bitirmek için 0'a basın");

        while (true) {
            System.out.println("1 den 3 e kadar ürün seçin,çıkış için 0 a absın");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    total += 5;
                    System.out.println("su başarıyla eklendi .Toplam" + total + "Tl");
                    break;

                case 2:
                    total += 3;
                    System.out.println("ekmek başarıyla eklendi.Toplam" + total + "Tl");
                    break;
                case 3:
                    total += 2;
                    System.out.println("çikolata başarıyla eklendi" + total + "Tl");
                    break;
                case 0:
                    System.out.println("alışveriş tamamlandı");
                    break;
                default:
                    System.out.println("geçersiz seçim lütfen tekrar deneyin");
                    continue;


            }
            if (secenek == 0) {
                break;
            }


        }
        System.out.println("indirim kuponun var mı.E/H");
        coupon = scanner.next().charAt(0);
        if (coupon == 'E' || coupon == 'e') {
            total *= 0.9;
            System.out.println("%10 indirim yapıldı");

        }
        System.out.println("toplam tutar " + total + "TL");
        scanner.close();


    }

}
