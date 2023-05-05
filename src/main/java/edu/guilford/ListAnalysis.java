package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class ListAnalysis 
{
    public static void main( String[] args ) {
        // declare a constant for a 1000 elements
        final int SIZE = 10000;
        // declare and instantiate an array list of animal objects
        ArrayList<Animal> animalsArray = new ArrayList<Animal>();
        // declare and instantiate a linked list
        LinkedList<Animal> animalsList = new LinkedList<Animal>();

        // add the 1000 animal objects to the array list and linked list
        for (int i = 0; i < SIZE; i++) {
            animalsArray.add(new Animal());
            animalsList.add(new Animal());
        }

        // time how long it takes to add 1000 elements to both lists 
        //ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            animalsArray.add(new Animal());
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        //LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            animalsList.add(new Animal());
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // time how long it takes to sort both lists 
        // using collections.sort
        //ArrayList
        startTime = System.nanoTime();
        Collections.sort(animalsArray);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList sort time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        //LinkedList
        startTime = System.nanoTime();
        Collections.sort(animalsList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList sort time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // time how long it takes to shuffle both lists 
        // using collections.shuffle
        //ArrayList
        startTime = System.nanoTime();
        Collections.shuffle(animalsArray);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList shuffle time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        //LinkedList
        startTime = System.nanoTime();
        Collections.shuffle(animalsList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList shuffle time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // time 1000000 random gets from both lists
        //ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            animalsArray.get((int) (Math.random() * SIZE));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList random get time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        //LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            animalsList.get((int) (Math.random() * SIZE));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList random get time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // time both lists to get each element sequentially
        //ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            animalsArray.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList sequential get time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        //LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            animalsList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList sequential get time: " + String.format("%.2f", duration / 1.e6) + " milliseconds");








    }
}
