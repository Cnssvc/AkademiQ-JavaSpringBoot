package WeekTWO;
import java.util.ArrayList;
import java.util.Random;

public class QuestionSIX {
    public static void main(String[] args) {
        /*Soru 6:
        Bir ArrayList<Integer> oluşturun ve içine rastgele 20 sayı ekleyin.
	•	Sadece çift sayıları ayrı bir listeye ekleyin ve yazdırın.*/

        ArrayList<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> ciftSayilar = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 20; i++) {
            int rastgeleSayi = random.nextInt(100);
            sayilar.add(rastgeleSayi);
        }
        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            }
        }
        System.out.println("Tüm sayılar: " + sayilar);
        System.out.println("Çift sayılar: " + ciftSayilar);
    }
}
