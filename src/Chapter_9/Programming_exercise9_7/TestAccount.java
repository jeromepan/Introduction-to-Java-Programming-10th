package Chapter_9.Programming_exercise9_7;

/**
 * Created by lmsj0 on 9/11/2017.
 */
public class TestAccount {
    public static void main(String []args){



        Account ac = new Account();
        java.util.Date dateCreated  = ac.getDateCreated();
        dateCreated.setTime(10000000);//

        ac.setId(1122);
        ac.setBalance(20000);
        ac.setAnnualInterestRate(4.5);

        ac.withdraw(2500);
        ac.deposit(3000);

        System.out.println(ac.getDateCreated());
        System.out.println(ac.tostring());
    }
}
