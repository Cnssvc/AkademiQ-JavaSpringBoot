import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {

        /*ÖDEV 3: Trafik Cezası Hesaplayıcı (If-Else, Switch-Case)

        Senaryo:

        Bir trafik polisi, araba hızını ölçen bir sistem kullanıyor. Eğer sürücü belirlenen hız sınırını aşarsa, hızına göre ceza kesiliyor.

                İşleyiş:
	•	Hız sınırı 90 km/s.
	•	Eğer hız:
	•	90-110 km/s arasındaysa: 1000 TL ceza
	•	110-130 km/s arasındaysa: 2000 TL ceza
	•	130 km/s üzerindeyse: Ehliyete el konulur!
	•	Kullanıcı, hızını girerek durumunu öğrenir.*/

        Scanner scanner = new Scanner(System.in);
        int speed;
        int code;
        System.out.println("Trafik Cezası Hesaplayıcı");
        System.out.println("lütfen hızınızı giriniz");
        speed = scanner.nextInt();
        if (speed <= 90) {
            code = 0;
        } else if (speed > 90 && speed <= 110) {
            code = 1;
        } else if (speed > 110 && speed <= 130) {
            code = 2;
        } else{
            code =3;

        }
        switch (code) {
            case 0:
                System.out.println("ceza yok");
                break;
            case 1:
                System.out.println("cezanız 1000 Tl");
                break;
            case 2:
                System.out.println("cezanız 2000 Tl");
                break;
            case 3:
                System.out.println("ehliyetinize el konuldu");
                break;
            default:
                System.out.println("geçersiz veri");
                break;

        }
        scanner.close();

    }
}
