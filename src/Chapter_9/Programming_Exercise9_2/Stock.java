package Chapter_9.Programming_Exercise9_2;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){

    }

    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;

    }

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;

    }

    String getSymbol(){
        return symbol;
    }

    String getName(){
        return name;
    }


    void setPreviousClosingPrice(double newPreviousClosingPric){
        previousClosingPrice = newPreviousClosingPric;
    }

    void setSymbol(String newSymbol){
        symbol = newSymbol;
    }

    void setName (String newName){
        name = newName;
    }

    void setCurrentPrice(double newCurrentPrice){
        currentPrice = newCurrentPrice;
    }
}
