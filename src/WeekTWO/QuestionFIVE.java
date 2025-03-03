package WeekTWO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionFIVE {
    public static void main(String[] args) {
        /*Soru 5:
        Kullanıcıdan 10 adet kelime alarak bir ArrayList<String> içine ekleyin.
        Girilen kelimeleri alfabetik sıraya göre sıralayan bir Java programı yazın.*/
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için
        ArrayList<String> kelimeler = new ArrayList<>(); // Kelimeleri tutacak ArrayList


        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". kelimeyi girin: ");
            String kelime = scanner.nextLine();
            kelimeler.add(kelime);
        }


        Collections.sort(kelimeler);


        System.out.println("Alfabetik sıraya göre sıralanmış kelimeler: ");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }


    }
}
