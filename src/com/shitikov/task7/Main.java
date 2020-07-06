package com.shitikov.task7;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("1 — английский\n2 - белорусский\nлюбой — русский\nВведите цифру: ");
        int input = 0;
        try(Scanner scanner = new Scanner(System.in)) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Введите цифру: ");
                input = scanner.nextInt();
                String country = "";
                String language = "";
                switch (input) {
                    case 1:
                        country = "US";
                        language = "EN";
                        break;
                    case 2:
                        country = "BY";
                        language = "BE";
                        break;
                    case 3:
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
