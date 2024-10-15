package net.salesianos.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

    private String inputFileName;

    public FileProcessor(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public String[] process() {
        try (Scanner scanner = new Scanner(new File(inputFileName))) {
            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
            return content.toString().split("\n");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return new String[0];
        }
    }
}