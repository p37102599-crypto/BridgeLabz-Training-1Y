package com.gla.ExceptionHandling;


    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class filereader {
        public static void main(String[] args) {

            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\ExceptionHandling\\src\\data.txt"));
                String line;

                // Read file line by line
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close();
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
    }

