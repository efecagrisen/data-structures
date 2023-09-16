package com.cydeo;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();
        System.out.println("kth item from the last: " + myList.findKthFromLast(10));
        myList.deleteKthFromLast(10);
        myList.printNodes();

//
//        myList.deleteById(9);
//        myList.printNodes();
//        System.out.println("Index of 3 : " + myList.indexOf(3));
//
//        myList.addFirst(5);
//        myList.printNodes();






    }
}
