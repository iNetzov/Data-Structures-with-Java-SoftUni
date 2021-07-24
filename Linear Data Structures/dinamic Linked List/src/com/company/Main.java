package com.company;


import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> people =  new LinkedList<>();
        people.add("joro");
        people.add("cvetan");
        people.add("martin");
        people.add("ivailo");
        //view elemets
//        for (String person : people) {
//            System.out.println(person);
//        }
        //view elements

        //removing element
        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()){
         String person = iterator.next();
            if (person.equals("joro")){
                iterator.remove();
            }else{
                System.out.println(person);
            }
        }
    }
}
