package ru.croc.task9;

import java.util.Scanner;

public class Task9 {

    public static String normal(String a){

        for(int i=a.length()-1;i>0;){

            if (a.substring(i-1, i+1).equals("./")) {

                if (a.charAt(i-2) == '.') {
                    return a.substring(i-2);
                }

                return a.substring(i-1);
            }
            else {
                i--;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        System.out.print("Введите путь: ");
        String a = b.nextLine();

        System.out.println(normal(a));

    }

}