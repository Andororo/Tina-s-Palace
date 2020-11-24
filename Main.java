package com.company;
import java.util.*;

class Main {
    //Creating an empty stack
    static Deque<String> myDeque = new LinkedList<String>();
    //Creating Queue
    static Queue<String> myQueue = new LinkedList<String>();
    static Scanner scan = new Scanner(System.in);
    static String order = "";

    public static void main(String[] args) {
        System.out.println("Hi, Welcome to Tina's Palace! There is a long line ahead of us so let's get started :)\n");
        System.out.println("What would you like?");

        while (!order.equals("QUIT")) {
            order = scan.nextLine();
            if(!order.equals("QUIT")) {
                System.out.println("Next! What would you like?");
                myDeque.push(order);
                myDeque.push(",");
                myQueue.add(order);
            } else {
                myDeque.pop();
            }
        }

        System.out.println("\nOrder Summary for the day:");
        System.out.println("\nList of orders:\n");
        //Making list of order with queue first in first out.
        if (myQueue.size() > 0) {
            int count = 1;
            for (String item : myQueue) {
                System.out.println("Order#" + count + ": " + item);
                count++;
            }
        }
        System.out.println("\nOrder Tracker:");
        //making list of order tracker with Stack
        for (String item : myDeque) {
            System.out.print(item);
        }
        scan.nextLine();
    }
}

