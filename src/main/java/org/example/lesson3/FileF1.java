package org.example.lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.*;

public class FileF1 {
    public static void main(String[] args) {
        // среднее арифметическое
         File inputFile = new File("input.txt");
         File outputFile = new File("output.txt");
         int sum = 0;
         int k = 0;
         try{
             Scanner scanner = new Scanner(inputFile);
             while (scanner.hasNext()) {
                 sum += scanner.nextInt();
                 k++;
             }
             Integer average = sum / k;
             PrintWriter writer = new PrintWriter(outputFile);
             writer.println(average);
             writer.close();
         } catch (FileNotFoundException e)  {

            System.out.println("File not found");
        }
    }
}
