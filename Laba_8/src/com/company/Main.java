package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader br;
        try {
            String text;
            br = new BufferedReader(new InputStreamReader(new FileInputStream
                    ("text.txt"), "windows-1251"));
            while ((text = br.readLine()) != null){System.out.println(text);}
        }
        catch (IOException e) {System.out.println("Error" + e);}
    }
}
