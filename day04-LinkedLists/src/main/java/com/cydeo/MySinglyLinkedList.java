package com.cydeo;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
        // create a new node object from data
        Node node=new Node(data);
        if (isEmpty()){ //if the list is empty
            head=tail=node;
            size++;
        }else { // if there are elements in the list
            tail.next=node;
            tail=node;
            size++;
        }
    }

    void deleteById(int id){
        // check if empty
        if (isEmpty()) System.out.println("List is empty!!!");
        // assign previous and current with the head
        Node prev = head;
        Node current = head;

        while (current!=null){
            if (current.id==id){ // if there is a match
                // case 1: head
                if (current==head){
                    head=current.next;
                    current.next=null;
                    size--;
                }
                // case 2: tail
                else if (current==tail) {
                    tail=prev;
                    prev.next=null; // ex-tail will be eligible for garbage collection
                }
                // case 3: middle
                else{
                    prev.next=current.next;
                    current.next=null; // current will be eligible for garbage collection
                }
                //after deletion
                size--;
            }
            // move forward the elements of the list
            prev=current;
            current=current.next;
        }
    }

    int indexOf(int id){
        if (isEmpty()) return -1;

        int position=0;

        // iterate through the list
        Node current = head; // set my current with the starting element
        while (current!=null){
            if (current.id==id) return position;
                position++;
                current=current.next;
        }
        return -1;
    }

    void addFirst(int data){
        // create a new node object from data
        Node node = new Node(data);
        if (isEmpty()){ //if the list is empty
            head=tail=node;

        }else{ // if there are elements in the list
            node.next = head;
            head=node;
        }
        size++;
    }


    public int findKthFromLast(int k){

        // cretae two pointers
        Node ptr1 = head;
        Node ptr2 = head;

        //move pointer two k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }

        //move both pointers until ptr2 hits the last element
        while (ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // ptr1 is on the kth element from the last
        return ptr1.id;
    }

    public void deleteKthFromLast(int k){

        //create 3 pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;

        for (int i = 0; i < k-1; i++) {
            ptr2= ptr2.next;
        }

        while (ptr2.next != null){

            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        //ptr one is the kth element from the last
        //Do the operation
        if (ptr1==head){
            head=ptr1.next;
            ptr1.next=null;
            size--;
        }else if (ptr1==tail){
            tail=prev;
            prev.next=null;
            size--;
        }else{
            prev.next = ptr1.next;
            ptr1.next=null;
            size--;
        }










    }


    void printNodes(){
        Node current=head;
        while (current!=null){
            if (current.next==null) System.out.println(current.id + " => null");
            else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }
    }



}
