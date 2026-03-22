package com.gla.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTryWithResources {

    public static void main(String[] args) {

        // try-with-resources (auto-closes the file)
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {

            // Read only the first line
            String firstLine = reader.readLine();

            if (firstLine != null) {
                System.out.println(firstLine);
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}