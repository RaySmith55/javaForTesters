package com.tutorialspoint.examples;

import java.io.*;

public class ReadConsole {

    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters. Enter 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != '#');
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
