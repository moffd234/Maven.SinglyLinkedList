package com.zipcodewilmington.singlylinkedlist;

import java.util.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<dt> extends AbstractSequentialList<dt>
                                        implements List<dt>{
    private int size;
    Node<dt> head;
    Node<dt> tail;


    private static class Node<dt> {
        public dt item;
        public Node<dt> next;

        Node(dt element, Node<dt> next) {
            this.item = element;
            this.next = next;
        }
    }

    SinglyLinkedList(){
         head = new Node<dt>(null, null); // Declares the head to be null
                                                       // since no head was provided
         tail = head; // Sets tail to head since there isn't more than one item
        size = 0;
    }
    SinglyLinkedList(dt a){
        head = new Node<dt>(a, null);
        tail = head; // Sets tail to head since there isn't more than one item
        size = 1;
    }

    public boolean contains(Object itemToFind){
        boolean hasObject = false;
        Node<dt> current = head;

        while(current != null && !hasObject){
            if(current.item == itemToFind){
                hasObject = true;
            }
            current = current.next;
        }
        return hasObject;
    }

    public boolean add(dt dt){
        if(dt == null){
            throw new NullPointerException();
        }
        if(!isEmpty()){
            Node<dt> prev = tail;
            tail = new Node<>(dt, null);
            prev.next = tail;
        }
        else{
            tail = new Node<>(dt, null);
            head = tail;  // Head and tail are the same since there is only one item
        }
        size++;
        return true;
    }

    public dt peekFirst() {
        return head.item;
    }

    public dt peekLast() {
        return tail.item;
    }

    public boolean remove(Object itemToRemove) {
        if(isEmpty() || !contains(itemToRemove)){
            return false;
        }
        Node<dt> current = head;
        Node<dt> prev = null;

        // If head is the itemToRemove change the head to the 2nd item
        if(head.item == itemToRemove){
            head = current.next;  // Will current be garbage collected?
            size -= 1;
            return true;
        }

        while(current != null && current.item != itemToRemove){
            prev = current;
            current = current.next;
        }
        size -= 1;
        prev.next = current.next;

        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ListIterator<dt> listIterator(int index) {
        return null;
    }

    @Override
    public String toString(){
        Node current = head;
        String output = "";
        while(current != null){
            if(current.next != null){
                output += current.item + ", ";
            }
            else{
                output += current.item;
            }
            current = current.next;
        }
        return output;
    }

    public Integer find(dt dataToFind){
        if(!this.contains(dataToFind)){
            return null;
        }
        Node current = head;
        int index = 0;
        while(current.item != dataToFind){
            current = current.next;
            index += 1;
        }
        return index;
    }

    public dt get(int index){
        if(index > size - 1){
            return null;
        }
        Node<dt> current = head;
        int i = 0;
        while(current != null){
            if(i == index){
                return current.item;
            }
            current = current.next;
            i++;
        }
        return null;
    }

    public SinglyLinkedList<dt> sCopy(){
        return this;
    }

    public SinglyLinkedList<dt> dCopy(){
        SinglyLinkedList<dt> newList = new SinglyLinkedList<>();
        Node<dt> current = head;

        while(current != null){
            newList.add(current.item);
            current = current.next;

        }
        return newList;
    }

    public SinglyLinkedList<dt> sort(){
        Node<dt> current = head, index = null;

        if (head == null) {
            return null;
        } else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != null) {

                    // Check if the current item is greater than the index item
                    if (((Comparable<dt>) current.item).compareTo(index.item) > 0) {
                        // Swap items
                        dt temp = current.item;
                        current.item = index.item;
                        index.item = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
        return this;
    }

}
