package chpter12.exercise12_4;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        if(annualInterestRate <= 0)throw new IllegalArgumentException("annualInterestRate must be greater than 0");
        if(numberOfYears <= 0)throw new IllegalArgumentException("numberOfYears must be greater than 0.");
        if(loanAmount <= 0)throw new IllegalArgumentException("loanAmount must be greater than 0");

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        if(annualInterestRate <= 0) throw new IllegalArgumentException("annualInterestRate must be greater than 0");
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        if(numberOfYears <= 0 )throw new IllegalArgumentException("numberofyears must be greater thean 0");

        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount){
        if(loanAmount <= 0)throw new IllegalArgumentException("loanAmount must be greater than 0");
        this.loanDate = loanDate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/1200;
        double totalPayment = loanAmount * monthlyInterestRate/ (1-(1/Math.pow(1 + monthlyInterestRate, numberOfYears *12)));
        return totalPayment;
    }

    public Date getLoanDate(){
        return loanDate;
    }
}
