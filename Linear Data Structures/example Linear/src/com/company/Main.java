package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,5,6,7,8,9,0,42,7,15,100));
        numbers.add(44);
       // numbers.get(2); //6 constant power
       // Collections.sort(numbers); // O(n^2)  best case can sort -> o(n*log(n))

        int[] counts = new int[101]; // 0-100
        for (int number : numbers){ //0(n)
            counts[number]++;
        } //0(n)

        //o(n)
        for (int number = 0; number <= 100; number++) {
            int count = counts[number];
            for (int i = 0; i<count; i++){
                System.out.print(number+ " ");
            }

        }
        //0(n)
        System.out.println();




        Collections.sort(numbers);
        for(int number : numbers){
            System.out.print(number+" ");
        }
    }
}
