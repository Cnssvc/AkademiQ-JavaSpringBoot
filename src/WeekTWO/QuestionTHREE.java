package WeekTWO;

public class QuestionTHREE {
    public static void main(String[] args) {
        /*Soru 3:
        Bir dizide bulunan pozitif ve negatif sayıların toplamını ayrı ayrı hesaplayan bir Java programı yazın.*/
        int [] ary={5,-3,8,-20,1,-7};
        int positiveTotal=0;
        int negativeTotal=0;

        for (int number: ary){
            if(number>0){
                positiveTotal+=number;
            }
            else if (number<0){
                negativeTotal+=number;
            }
        }
        System.out.println("pzitif sayıların toplamı:"+positiveTotal);
        System.out.println("negatif sayıların toplamı:"+negativeTotal);

    }
}
