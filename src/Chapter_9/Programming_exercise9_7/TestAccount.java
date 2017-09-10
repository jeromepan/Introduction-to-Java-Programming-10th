package Chapter_9.Programming_exercise9_7;

import java.util.Date;

/**
 * Created by lmsj0 on 9/11/2017.
 */
public class TestAccount {
    public static void main(String []args){

        Account [] list;

        Account ac = new Account(1122,20000);
        Date da = new Date();

        //ac.setId(1122);
        //ac.setBalance(20000);
        ac.setAnnualInterestRate(4.5);

        ac.withdraw(2500);
        ac.deposit(3000);

        System.out.println(ac.getDateCreated());
        System.out.println(ac.tostring());
    }
}
