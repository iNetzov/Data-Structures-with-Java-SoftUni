package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date start = new Date();
        //extractedMethod2();
        //extractedMethod1();
        Date end = new Date();
        System.out.println(end.getTime()-start.getTime());
    }

// shows a complexity of n the n is number of elements
    private static void extractedMethod1() {
        long n = 1000L * 100L ;
        for (long firstIndex = 0; firstIndex < n; firstIndex++) {
        }
    }
    ///INCREASE THE ALGO COMPLEXITY FROM N TO (N^2) n^2 becouse we have nested for loop
    private static void extractedMethod2() {
        long n = 1000L * 100L ;
        for (long firstIndex = 0; firstIndex < n; firstIndex++) {
            for (long secondIndex = 0; secondIndex < n; secondIndex++) {

            }
        }
    }
}
