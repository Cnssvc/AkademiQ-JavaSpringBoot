package WeekTWO;
import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;

public class QuestionTWO {
    public static void main(String[] args) {
        /*Soru 2:
        Bir dizide tekrar eden elemanları bulan bir program yazın. (Örnek giriş: [5, 3, 8, 3, 1, 5, 8] → Çıktı: Tekrar eden sayılar: 3, 5, 8)*/
        int [] Ary={5,3,8,3,1,5,8};

        Set <Integer>recurring=new HashSet<>();
        Set<Integer>controlSet=new HashSet<>();

        for(int number:Ary){
            if(!controlSet.add(number)){
                recurring.add(number);
            }
        }
        System.out.println("tekrar eden sayılar : "+recurring);

    }
}
