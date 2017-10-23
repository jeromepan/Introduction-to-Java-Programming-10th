package chpter12.exercise12_4;

public class LoanTest {
    public static void main(String [] args){
        try{
            new Loan(-2, 60,2000);
            Loan money = new Loan(5, -2,3);
        }catch (Exception ex){
            //System.out.println("IllegalArgumentException: " + ex.getMessage());
            System.out.println(ex);
        }
        System.out.println("\nprogram end");
    }
}
