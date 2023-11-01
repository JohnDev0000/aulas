package Generics_Set_Map.application;

import Generics_Set_Map.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class mapApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> E = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String name = null;
            Integer count = null;

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                name = fields[0];
                count = Integer.parseInt(fields[1]);

                if (E.containsKey(name)) {
                    int votes = E.get(name);
                    E.put(name, count + votes);
                }
                else {
                    E.put(name, count);
                }

                line = br.readLine();
            }

            for (String key : E.keySet()) {
                System.out.println(key + ": " + E.get(key));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}
