import java.util.List;

public class SampleMain {
    public static void main(String[] args) {
        SouvenirStock stock = new SouvenirStock();
        stock.restock("Topi", 5);
        stock.restock("Mug", 3);
        stock.restock("Mug", 2);
        System.out.println(stock.getAvailableItems());
        System.out.println(stock.getMostStockedItem());
        System.out.println(stock.sell("Mug", 6));
        System.out.println(stock.getStock("Mug"));
        System.out.println(stock.sell("Mug", 5));
        System.out.println(stock.getAvailableItems());
        System.out.println(stock.getTotalStock());
        stock.restock("Pin", 0);
        System.out.println(stock.getStock("Pin"));
        List<String> copy = stock.getAvailableItems();
        copy.clear();
        System.out.println(stock.getMostStockedItem());
    }
}
