import InterfaceSample.Developer;
import InterfaceSample.Manager;
import PolimorfismSample.CheckingAccount;
import PolimorfismSample.SavingAccount;


public class Main {
    public static void main(String[] args) {
        Developer dv =new Developer(1,"cansu savcı",5000,"back-end","programmer");
        Manager manager =new Manager(1,"cansu savcı",2000,"development",20);

        System.out.println("Develeoper promotion:"+dv.calculateBonus());
        System.out.println("manager promotion:"+manager.calculateBonus());

        System.out.println("-*-*-*-*-*-*-*-*-*-*");
        SavingAccount sv =new SavingAccount("cansu savcı",4000);
        CheckingAccount cv=new CheckingAccount("cansu savcı",6000);

        sv.CalculateInterest();
        cv.CalculateInterest();






    }


}

