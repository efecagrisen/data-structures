package com.cydeo;

import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        System.out.println("Node1's address is: " + node1 + " Node1's next adress is: "+ node1.next);
        System.out.println("Node1's address is: " + node2 + " Node1's next adress is: "+ node2.next);
        System.out.println("Node1's address is: " + node3 + " Node1's next adress is: "+ node3.next);
        System.out.println("Node1's address is: " + node4 + " Node1's next adress is: "+ node4.next);

        Node current;
        Node head = node1;
        current=head;
        while (current!=null){
            System.out.println("Id of node is: " + current.id);
            current=current.next;
        }
    }
}
