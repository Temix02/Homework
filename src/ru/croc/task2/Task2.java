package ru.croc.task2;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер в байтах:");
        long a = sc.nextLong();
        int b = 0;
        double c = 0;

        while (a >= 1024) {
            a /= 1024;
            c = (double)a;
            b++;
        }
        switch (b) {
            case(0):
                System.out.printf("%.1f", c);
                System.out.print("В");
                break;
            case (1):
                System.out.printf("%.1f", c);
                System.out.print("КВ");
                break;
            case (2):
                System.out.printf("%.1f", c);
                System.out.print("MВ");
                break;
            case (3):
                System.out.printf("%.1f", c);
                System.out.print("ГВ");
                break;
            case (4):
                System.out.printf("%.1f", c);
                System.out.print("ТВ");
                break;
            default:
                System.out.println("Неверный размер");
                break;
        }
    }

}
