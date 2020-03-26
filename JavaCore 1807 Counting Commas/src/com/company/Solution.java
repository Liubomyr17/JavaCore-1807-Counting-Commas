package com.company;

/*
1807 Counting Commas
From the console, read the file name.
Calculate the number of characters ',' in the file, display the number on the console.
Close streams.
Hint:
you need to compare with the ascii code of the character ','.

Requirements:
1. The program should read the file name from the console.
2. To read from a file, use the FileInputStream stream.
3. The console should display the number of commas in the read file.
4. The stream of reading from the file should be closed.
 */

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.FileInputStream;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        int count = 0;
        try {
            FileInputStream f = new FileInputStream(fileName);
            while(f.available() > 0) {
                char ch = (char)f.read();
                if(ch == ',')
                    count++;
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found1");
        } catch (IOException e) {
            System.out.println("File " + fileName + " can't read");
        }
        System.out.println(count);
    }
}
