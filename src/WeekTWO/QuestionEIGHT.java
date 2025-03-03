package WeekTWO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionEIGHT {
    public static void main(String[] args) {
        /*Soru 8:
        Bir ArrayList<Integer> oluşturun ve içine 10 sayı ekleyin.
	•	Listenin en büyük ve en küçük elemanını bulan bir Java programı yazın.*/
        ArrayList<Integer> sayilar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            int sayi = scanner.nextInt();
            sayilar.add(sayi);
        }
        int enBuyuk = Collections.max(sayilar);
        int enKucuk = Collections.min(sayilar);
        System.out.println("Listedeki en büyük sayı: " + enBuyuk);
        System.out.println("Listedeki en küçük sayı: " + enKucuk);

    }
}
