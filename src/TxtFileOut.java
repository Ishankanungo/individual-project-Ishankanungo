import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TxtFileOut {
    public void InvalidOrders(List<Order> invalidOrders, String newFileName) throws IOException {
        File newFile = new File(newFileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        writer.write("Incorrect Quantities");
        writer.write("\n");
        for(Order val : invalidOrders){
            String item_name = val.item_name;
            writer.write(item_name + " " + val.quantity );
            writer.write("\n");
        }
        writer.close();
    }
}


