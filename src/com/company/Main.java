package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        int jupSan = 2 ;

        for (int i = 0; i<arr.length;i++) {
            if ( arr[i] % jupSan == 0 ) {
                //jupSan++;
                System.out.println(arr[i] + " " + i);
            }
            System.out.println();

        }

    }
}
