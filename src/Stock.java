import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock{
    Map<String, Item> dataset;

    public Stock() {
    }

    public Map<String, Item> getDataset() {
        return dataset;
    }
    public void create(List<String> items){
        this.dataset = new HashMap<>();
        int index = 0;
        for(String item : items){
            index++;
            if(index == 1) continue;
            String[] item_details = item.split(",");
            String category = item_details[0];
            String item_name = item_details[1];

            int quantity = Integer.parseInt(item_details[2]);
            double price  = Double.parseDouble(item_details[3]);
            Item itemObj = new Item( quantity,item_name, price, category);
            this.dataset.put(item_name, itemObj);
        }
        for(Map.Entry<String, Item> entry: this.dataset.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}

