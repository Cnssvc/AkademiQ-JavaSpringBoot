package WeekTWO;

public class QuestionNINE {
    public static void main(String[] args) {
        /*Soru 9:
        Java’daki ArrayList metodlarını araştırın ve her biri için ne işe yaradığını, nasıl kullanıldığını ve örnek kod yazın:
	•	get()
	•	set()
	•	remove()
	•	clear()
	•	size()*/
        /*get() Metodu
                Belirtilen indeksteki elemanı döndürür.
                arrayList.get(int index)

        Örnek:*/

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        String sehir = sehirler.get(1);
        System.out.println(sehir);

        /*set() Metodu
                Belirtilen indeksteki elemanı yeni bir değerle değiştirir.


        arrayList.set(int index, E element)

        Örnek:*/

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.set(1, "İzmir");
        System.out.println(sehirler);

        /*remove() Metodu

                Belirtilen indeksteki veya belirtilen elemanı listeden siler.



        arrayList.remove(int index) (İndeksle silme)

        arrayList.remove(Object o) (Elemanla silme)

        Örnek:*/


        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.remove(1);
        System.out.println(sehirler);

        sehirler.remove("Ankara");
        System.out.println(sehirler);

        /*clear() Metodu

                Listedeki tüm elemanları siler.

                Nasıl Kullanılır?
                arrayList.clear()

        Örnek:*/


        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.clear();
        System.out.println(sehirler);

        /*clear() Metodu

                Listedeki tüm elemanları siler.


                arrayList.clear()

        Örnek:*/


        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.clear();
        System.out.println(sehirler); // Çıktı: []

    }
}
