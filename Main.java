public class Main {
    public static void main(String[] args) {
        StockSubject appleStock = new StockSubject("Apple", 150.0);
        StockObserver investor1 = new ConcreteObserver("Investor A");
        StockObserver investor2 = new ConcreteObserver("Investor B");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        appleStock.setPrice(155.0);
    }
}
