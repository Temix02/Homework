package ru.croc.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = new int[] {28, 5, 11, 1, 44, 17, 8};

        int a = 0,b = 0;

        int min, max;

        min = arr[0];
        max = arr[0];

        for (int i = 1; i <= (arr.length-1); i++){

            if(arr[i] < arr[i-1]){
                if(arr[0] > arr[i]){
                    if(arr[a] > arr[i]) {
                        min = arr[i];
                        a = i;
                    }
                }
            }
            if(i == (arr.length-1)){
                arr[a] = arr[0];
                arr[0] = min;
            }

        }

        for (int i = 1; i <= (arr.length-1); i++){

            if(arr[i] > arr[i-1]){
                if(arr[0] < arr[i]){
                    if(arr[b] < arr[i]) {
                        max = arr[i];
                        b = i;
                    }
                }
            }
            if(i == (arr.length-1)){
                arr[b] = arr[arr.length-1];
                arr[arr.length-1] = max;
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
