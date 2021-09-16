package receipt;
import java.io.FileInputStream;
import java.io.*;
import java.util.*; 

public class InputReader {

    public static void readFile(String filename, CategoryMatching cat, Receipt receipt){

        try(Scanner fileSc = new Scanner(new FileInputStream(filename))) {
            fileSc.useDelimiter(",|\r\n|\n");
            
            while (fileSc.hasNext()) { // 1 line
                String[] line = fileSc.next().split(" ");
                int qty = Integer.parseInt(line[0]); 
                double basePrice = Double.parseDouble(line[line.length-1]);
                String name = "";
                Boolean imported = false; 

                for (int i = 1; i < line.length - 2; i++ ){ 
                    if (i == 1) {
                        name += line[i]; 
                    } else {
                        name += " " + line[i]; 
                    }
                  
                }
                Item item = new Item(name, qty, basePrice);
                
                cat.matchCategory(item, receipt);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
    }

}
