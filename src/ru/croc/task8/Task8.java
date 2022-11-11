package ru.croc.task8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Task8 {

    public static void main(String[] args) throws FileNotFoundException {

        int a = 0;
        File file = new File("C:\\Users\\artem\\IdeaProjects\\homework\\src\\ru\\croc\\task8\\File");
        String b;
        boolean d;

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            b = sc.next();
            d = false;
            for (int i = 0; i < b.length(); ++i) {
                char c = b.charAt(i);
                if ((c >= '0' && c <= '9') || (c >= 'а' && c <= 'я') || (c >= 'А' && c <= 'Я') ||
                        (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
                    d = true;
                    break;
                }

            }
            if (d) {
                a++;
            }

        }
        System.out.println("В фаиле " + a + " слов");
    }

}


