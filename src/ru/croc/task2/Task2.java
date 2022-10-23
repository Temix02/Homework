package ru.croc.task2;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер в байтах:");
        double a = sc.nextLong();
        int b = 0;
        double c = 0;

        while (a >= 1024) {
            a /= 1024;
            ++b;
            if(b == 4)
            {
                break;
            }
        }
        switch (b) {
            case(0):
                System.out.printf("%.1f", a);
                System.out.print("В");
                break;
            case (1):
                System.out.printf("%.1f", a);
                System.out.print("КВ");
                break;
            case (2):
                System.out.printf("%.1f", a);
                System.out.print("MВ");
                break;
            case (3):
                System.out.printf("%.1f", a);
                System.out.print("ГВ");
                break;
            case (4):
                System.out.printf("%.1f", a);
                System.out.print("ТВ");
                break;
            default:
                System.out.println("Неверный размер");
                break;
        }
    }

}
