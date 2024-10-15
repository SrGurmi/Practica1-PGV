package net.salesianos.utils;



import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    public static void writeToFile(String outputFileName, String[] content) {
        try (FileWriter writer = new FileWriter(outputFileName)) {
            for (String line : content) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
