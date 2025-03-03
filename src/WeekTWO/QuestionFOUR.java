package WeekTWO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionFOUR {
    public static void main(String[] args) {
        /*Kullanıcıdan 10 adet sayı alıp bir ArrayList içine ekleyen ve
        ardından bu sayıları büyükten küçüğe sıralayan bir program yazın.*/
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Lütfen 10 adet sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers, Collections.reverseOrder());


        System.out.println("Büyükten küçüğe sıralanan sayılar:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
