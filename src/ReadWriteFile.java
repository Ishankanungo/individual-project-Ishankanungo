import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public  List<String> readFile(String fileName) throws IOException {
        List<String> result = new ArrayList<>();
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                result.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
    public void OutputGenerated(double bill, String newFileName) throws IOException {
        File newFile = new File(newFileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        writer.write("Amt Paid");
        writer.write("\n");
        writer.write(String.valueOf(bill));
        writer.close();
    }
}
