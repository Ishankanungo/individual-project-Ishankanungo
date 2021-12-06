import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerOrder {
    private List<Order> orders;
    private List<String> cards;

    public CustomerOrder( List<String> prevCards){ this.cards= prevCards;}

    public void OrderCreation(List<String> orders_list){
        List<Order> result = new ArrayList<>();
        Set<String> cardsUpdate = new HashSet<>();
        int index = 0;
        for(String order : orders_list){
            index++;
            if(index == 1) continue;
            String[] order_details = order.split(",");
            String item_name = order_details[0];
            int quantity = Integer.parseInt(order_details[1]);
            String card_number = order_details[2];
            cardsUpdate.add(card_number);
            result.add(new Order(item_name, quantity, card_number));
        }
        List<String> CardsUpdate1 = new ArrayList<String>(cardsUpdate);
        this.orders = result;
        this.cards.addAll(CardsUpdate1);
    }
    public List<Order> OrderValidation(Stock stock, int EssentialMax, int LuxuryMax, int MiscellaneousMax){
        List<Order> inValidOrders = new ArrayList<>();
        for(Order order : orders){
            String item_name = order.item_name;
            int quantity = order.quantity;

            Item item = stock.dataset.get(item_name);
            if((item.category.equals("Essential") &&  quantity > EssentialMax) || quantity > item.quantity ){
                inValidOrders.add(order);
            }else if((item.category.equals("Luxury") &&  quantity > LuxuryMax) || quantity > item.quantity ){
                inValidOrders.add(order);
            }else if((item.category.equals("Misc")  &&  quantity > MiscellaneousMax) || quantity > item.quantity ){
                inValidOrders.add(order);
            }

        }
        return inValidOrders;
    }

    public double BillAmount(Stock stock){
        double total = 0;
        for(Order val : orders){
            String item_name = val.item_name;
            Item item = stock.dataset.get(item_name);
            double price = item.price;
            int quantity= val.quantity;
            total += price * quantity;
        }
        return total;
    }
}
