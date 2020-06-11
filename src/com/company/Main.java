package com.company;

public class Main {

    public static void main(String[] args) {

        // Test
        MinHeap myobj = new MinHeap();

        myobj.add(10);
        myobj.add(15);
        myobj.add(20);
        myobj.add(17);
        myobj.add(25);

        // Print Heap
        System.out.println("\n" + myobj);
        System.out.println("First Element in Heap: " + myobj.peek());

        myobj.pull();
        System.out.println("\n" + myobj);
        System.out.println("First Element in Heap: " + myobj.peek());

        myobj.pull();
        System.out.println("\n" + myobj);
        System.out.println("First Element in Heap: " + myobj.peek());







    }
}
