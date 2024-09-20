// StockSubject.java
import java.util.ArrayList;
import java.util.List;

public class StockSubject {
    private List<StockObserver> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public StockSubject(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockName, price);
        }
    }
}

