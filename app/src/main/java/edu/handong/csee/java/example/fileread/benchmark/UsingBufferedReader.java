package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {

        if (args.length < 1) {
            System.out.println("Please provide a file name as a command line argument.");
            return;
        }

        //-------------- Test reading file. --------------------

        StopWatch.start();
        String fileName = args[0];

        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileName))) {
            while (inputStream.read() != -1) {
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }


        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");
        

    }
}
