import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        /*ÖDEV 4: Öğrenci Ders Notları ve Geçme Durumu (If-Else, For)

        Senaryo:

        Bir öğrenci yönetim sistemi, öğrencinin 5 farklı dersten aldığı notları alır ve ortalamasını hesaplar.

        İşleyiş:
	•	Öğrenci, 5 dersin notlarını girer.
	•	Not ortalaması 50’nin üzerindeyse geçti, altında kaldı mesajı gösterilir.
	•	Eğer öğrencinin herhangi bir notu 30’un altındaysa, uyarı verilir: “Düşük not aldığınız dersler var!”.
	•	En yüksek ve en düşük notlar ekrana yazdırılmalıdır.*/
        Scanner scanner = new Scanner(System.in);

        int not;
        int total = 0;
        int enYuksek = 0;
        int enDusuk = 100;
        boolean dusukNotVar = false;
        System.out.println("ders notları ve geçme durumu ekranı");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ".Dersin notunun girin");
            not = scanner.nextInt();

            if (not < 0 || not > 100) {
                System.out.println("geçersiz not girdiniz lütfen tekara deneyiniz");
                i--;
                continue;
            }
            total += not;
            if (not == 1) {
                enYuksek = not;
                enDusuk = not;
            } else {
                if (not > enYuksek) {
                    enYuksek = not;
                }
                if (not < enDusuk) {
                    enDusuk = not;
                }
            }
            if (not < 30) {
                dusukNotVar = true;

            }
        }
        double avg=total/5.0;
        System.out.println("ortalama:"+avg);
        if(avg>50){
            System.out.println("geçtiniz");
        }
        else{
            System.out.println("kaldınız");
        }
        if(dusukNotVar){
            System.out.println("düşük notlu dersiniz var");
        }
        System.out.println("en düşük not:"+enDusuk);
        System.out.println("en yüksek not"+enYuksek);

        scanner.close();
    }


}

