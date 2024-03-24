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

    private static class Node<DataType> {
        DataType item;
        Node<DataType> next;

        Node(DataType element, Node<DataType> next) {
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
        Node current = head;

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
            Node prev = tail;
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

    public dt remove() {
        return null;
    }

    public dt poll() {
        return null;
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


}
