package WeekTWO;

import java.util.Scanner;

public class QuestionONE {
    public static void main(String[] args) {
        /*Soru 1:
        Kullanıcıdan 10 adet tam sayı alarak bir diziye ekleyin. Dizinin ortalamasını hesaplayan
         ve 50’den büyük olan elemanları listeleyen bir Java programı yazın*/
        Scanner scanner=new Scanner(System.in);
        int[] numbers =new int[10];
        int total=0;
        for(int i=0;i<10;i++){
            System.out.println((i+1)+". Sayıyı giriniz");
            numbers[i]=scanner.nextInt();
            total+=numbers[i];
        }
        double avg= (double) total/10;
        System.out.println("diziniz ortalaması:"+avg);

        System.out.println("dizideki 50 den büyük sayılar:");
        for(int number:numbers){
            if( number>50){
                System.out.println(number+"");
            }
        }
        scanner.close();
    }
}
