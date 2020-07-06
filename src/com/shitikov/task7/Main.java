package com.shitikov.task7;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("1 — английский\n2 - белорусский\nлюбой — русский\nВведите цифру:\n");
            char input = 0;
            try {
                input = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (input) {
                case '1':
                    country = "US";
                    language = "EN";
                    break;
                case '2':
                    country = "BY";
                    language = "BE";
                    break;
                case '3':
                    country = "RU";
                    language = "RU";
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("property.text", current);
            String s1 = rb.getString("str1");
            System.out.println(s1);
            String s2 = rb.getString("str2");
            System.out.println(s2);
        }
    }
}
