package Chapter_9.Programming_Exercise9_2;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class TestStock {
    public static void main(String [] args){
        Stock st = new Stock("ORCL", "Orocle Corporation");
        st.setPreviousClosingPrice(34.5);
        st.setCurrentPrice(34.35);

        System.out.println("the symbol is " + st.getSymbol() );
        System.out.println("the name is " + st.getName());
        System.out.println("the previousPrice is " + st.previousClosingPrice);
        System.out.println("the currentPrice is " + st.currentPrice);
        System.out.println("the price change-percentage is " + st.getChangePercent() );
    }


}
