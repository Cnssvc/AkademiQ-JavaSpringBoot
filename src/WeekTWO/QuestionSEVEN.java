package WeekTWO;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionSEVEN {
    public static void main(String[] args) {
        /*Soru 7:
        Bir ArrayList<String> içerisine 5 farklı şehir ekleyin.
	•	Kullanıcıdan alınan bir şehrin listede olup olmadığını bulan bir Java programı yazın.
	•	Eğer şehir listede varsa, indeksini yazdırın.*/
        ArrayList<String> sehirler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Bursa");
        sehirler.add("Antalya");


        System.out.print("Bir şehir ismi girin: ");
        String arananSehir = scanner.nextLine();


        if (sehirler.contains(arananSehir)) {

            int indeks = sehirler.indexOf(arananSehir);
            System.out.println(arananSehir + " şehri listede bulundu. İndeks: " + indeks);
        } else {

            System.out.println(arananSehir + " şehri listede bulunamadı.");
        }

    }
}
