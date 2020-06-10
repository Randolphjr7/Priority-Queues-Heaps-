package com.company;

public class Main {

    public static void main(String[] args) {

        // Test
        MinHeap myobj = new MinHeap();

        myobj.add(5);
        myobj.add(4);
        myobj.add(2);
        myobj.add(7);
        myobj.add(9);
        myobj.add(10);
        myobj.add(1);
        myobj.add(3);
        myobj.add(6);
        myobj.add(15);

        System.out.println(myobj);


        // error find bug
        myobj.pull();
        System.out.println(myobj);
        myobj.pull();
        System.out.println(myobj);
        myobj.pull();
        System.out.println(myobj);
        myobj.pull();
        System.out.println(myobj);
        myobj.pull();
        System.out.println(myobj);







    }
}
