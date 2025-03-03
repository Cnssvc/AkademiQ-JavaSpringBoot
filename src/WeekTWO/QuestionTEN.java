package WeekTWO;

public class QuestionTEN {
    public static void main(String[] args) {
        /*Soru 10:
        Aşağıdaki dizilerle ilgili metodları araştırın ve her biri için açıklama ve örnek kod yazın:
	•	Arrays.sort()
	•	Arrays.binarySearch()
	•	Arrays.copyOfRange()
	•	Arrays.equals()
	•	Arrays.fill()*/
        /*Arrays.sort() Metodu

                Diziyi küçükten büyüğe (doğal sıralama) sıralar.
                Arrays.sort(dizi)

        Örnek:*/
                /*int[] sayilar = {5, 3, 8, 1, 2};
                Arrays.sort(sayilar); // Diziyi sıralar
                System.out.println(Arrays.toString(sayilar)); // Çıktı: [1, 2, 3, 5, 8]*/

        /*Arrays.binarySearch() Metodu

                Sıralı bir dizide belirli bir elemanı arar ve indeksini döndürür. Dizi sıralı değilse doğru sonuç vermez.


        Arrays.binarySearch(dizi, arananEleman)

        Örnek:*/
                /*int[] sayilar = {1, 2, 3, 5, 8};
                int indeks = Arrays.binarySearch(sayilar, 5);
                System.out.println("5'in indeksi: " + indeks); // Çıktı: 3*/

        /*Arrays.copyOfRange() Metodu
                Dizinin belirli bir aralığını kopyalar.

        Nasıl Kullanılır?
        Arrays.copyOfRange(dizi, baslangicIndeksi, bitisIndeksi)

        Örnek:*/
                /*int[] sayilar = {1, 2, 3, 5, 8};
                int[] yeniDizi = Arrays.copyOfRange(sayilar, 1, 4); // 1. indeksten 4. indekse kadar (4 dahil değil)
                System.out.println(Arrays.toString(yeniDizi)); // Çıktı: [2, 3, 5]*/

       /* Arrays.equals() Metodu
        Ne İşe Yarar?
                İki dizinin eşit olup olmadığını kontrol eder.

        Nasıl Kullanılır?
        Arrays.equals(dizi1, dizi2)

        Örnek:*/
               /* int[] dizi1 = {1, 2, 3};
                int[] dizi2 = {1, 2, 3};
                boolean esitMi = Arrays.equals(dizi1, dizi2); // true döner
                System.out.println("Diziler eşit mi? " + esitMi); // Çıktı: Diziler eşit mi? true*/

        /*Arrays.fill() Metodu

                Dizinin tüm elemanlarını belirtilen bir değerle doldurur.
        Arrays.fill(dizi, deger)

        Örnek:
                int[] sayilar = new int[5];
                Arrays.fill(sayilar, 10);
                System.out.println(Arrays.toString(sayilar)); // Çıktı: [10, 10, 10, 10, 10]*/


    }
}
