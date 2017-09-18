package Chapter_9.Programming_exercise9_7;

import java.util.Date;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date dateCreated;



    Account(){

       dateCreated = new java.util.Date();
       this.id = id;
        this.annualInterestRate = annualInterestRate;
       this.balance = balance;
    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;

    }

    public java.util.Date getDatecreated(){
        return dateCreated;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){

        return  annualInterestRate/12/100;
    }



    public double getMonthlyInterestRate(){
        return this.balance * annualInterestRate/12/100;
    }

    public void withdraw(double amount){
        this.balance = balance - amount;
    }

    public void deposit(double amount){
        this.balance = balance + amount;
    }

    public Date getDateCreated(){
        return dateCreated;

    }


    public String tostring(){
        return "Account name: " + id + "\n" + "Interest rate: " + annualInterestRate + "\n" + balance;
    }
}
