import java.io.IOException;
import java.util.List;

public class ExecuteOrder {
    public static void main(String[] args) throws IOException {
        ReadWriteFile csvHandler = new ReadWriteFile();
        List<String> items = csvHandler.readFile("src/Dataset.csv");
        Stock stock = new Stock();
        stock.create(items);
        List<String> cards= csvHandler.readFile(("src/Cards - Sheet1.csv"));

        List<String> orders = csvHandler.readFile("src/Input3 - Sheet1.csv");
        CustomerOrder placedOrder = new CustomerOrder(cards);
        placedOrder.OrderCreation(orders);
        List<Order> invalidOrders = placedOrder.OrderValidation(stock, 3,4,6);

        if(invalidOrders.size() == 0){
            double bill=  placedOrder.BillAmount(stock);
            csvHandler.OutputGenerated(bill, "output.csv");
        }
        else{
            TxtFileOut txt = new TxtFileOut();
            txt.InvalidOrders(invalidOrders, "invalid.txt");
        }

    }
}