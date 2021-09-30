package controller;

import model.Item;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {

    public static List<Item> readFile(String filename){

        List<Item> itemList = new ArrayList<>();

        try(Scanner fileSc = new Scanner(new FileInputStream(filename))) {
            fileSc.useDelimiter(",|\r\n|\n");

            while (fileSc.hasNext()) {
                String[] line = fileSc.next().split(" ");
                int quantity = Integer.parseInt(line[0]);
                double basePrice = Double.parseDouble(line[line.length-1]);
                String name = "";
                //Boolean imported = false;

                for (int i = 1; i < line.length - 2; i++ ){
                    if (i == 1) {
                        name += line[i];
                    } else {
                        name += " " + line[i];
                    }

                }
                Item item = new Item(name, quantity, basePrice);
                itemList.add(item);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
        return itemList;
    }

}