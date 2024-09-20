// ConcreteObserver.java
public class ConcreteObserver implements StockObserver {
    private String investorName;

    public ConcreteObserver(String investorName) {
        this.investorName = investorName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Notification to " + investorName + ": Stock " + stockName + " is now $" + price);
    }
}
