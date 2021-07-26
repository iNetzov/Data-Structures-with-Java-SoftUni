package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    static class MyQueue<T>{
        LinkedList<T> elements = new LinkedList<>();
        boolean isEmpty(){
            return  this.elements.isEmpty();
        }
        void push (T element){
            this.elements.add(element);
        }
        T pop (){
            T first =this.elements.getFirst();
            this.elements.remove(first);
            return  first;
        }
    }
    public static void main(String[] args) {
        MyQueue<String> names = new MyQueue<>();
        names.push("joro");
        names.push("pesho");
        names.push("misho");

        //pop
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());


    }
}
