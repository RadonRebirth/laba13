package com.company;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        while(true) {
            try(FileReader file = new FileReader("code.txt"); FileWriter fileWriter = new FileWriter("result.txt")) {
                int count = 0;
                String text = "";
                while ((count = file.read()) != -1) {
                    text += (char) count;
                }
                String a = text.replaceAll("\\//.+", "");
                String c = a.replaceAll("\\/\\*([\\S\\s]+)\\*\\/", "");

                fileWriter.write(c);
                fileWriter.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
