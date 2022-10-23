package ru.croc.task1;

import java.util.Scanner;

public class Task1
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату х вершины №1:");
        int ax = sc.nextInt();
        System.out.print("Введите координату y вершины №1:");
        int ay = sc.nextInt();
        System.out.print("Введите координату х вершины №2:");
        int bx = sc.nextInt();
        System.out.print("Введите координату y вершины №2:");
        int by = sc.nextInt();
        System.out.print("Введите координату х вершины №3:");
        int cx = sc.nextInt();
        System.out.print("Введите координату y вершины №3:");
        int cy = sc.nextInt();
        sc.close();

        double S = 0.5*(ax*(by-cy)+bx*(cy-ay)+cx*(ay-by));

        System.out.println("Площадь треугольника:" + S);

    }
}
