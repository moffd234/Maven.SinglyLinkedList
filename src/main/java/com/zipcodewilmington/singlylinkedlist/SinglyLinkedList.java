package com.zipcodewilmington.singlylinkedlist;

import java.util.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<dt> extends AbstractSequentialList<dt>
                                        implements List<dt>, Deque<dt>{
    private int size = 0;
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
    }
    SinglyLinkedList(dt a){
        head = new Node<dt>(a, null);
        tail = head; // Sets tail to head since there isn't more than one item
        size++;
    }

    private void linkFirst(dt dt) {
        final Node<dt> f = head;
        final Node<dt> newNode = new Node<>(dt, f);
        head = newNode;
        if (f == null)
            tail = newNode;
        size++;
        modCount++;
    }

    void linkLast(dt dt) {
        final Node<dt> l = tail;
        final Node<dt> newNode = new Node<>(dt, null);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    @Override
    public void addFirst(dt dt) {
        linkFirst(dt);
    }
    public boolean contains(Object dataType){
        return indexOf(dataType) != -1;
    }
    @Override
    public void addLast(dt dt) {
        linkLast(dt);
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

    @Override
    public boolean offerFirst(dt dt) {
        return false;
    }

    @Override
    public boolean offerLast(dt dt) {
        return false;
    }

    @Override
    public dt removeFirst() {
        return null;
    }

    @Override
    public dt removeLast() {
        return null;
    }

    @Override
    public dt pollFirst() {
        return null;
    }

    @Override
    public dt pollLast() {
        return null;
    }

    @Override
    public dt getFirst() {
        return null;
    }

    @Override
    public dt getLast() {
        return null;
    }

    @Override
    public dt peekFirst() {
        return null;
    }

    @Override
    public dt peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(dt dt) {
        return false;
    }

    @Override
    public dt remove() {
        return null;
    }

    @Override
    public dt poll() {
        return null;
    }

    @Override
    public dt element() {
        return null;
    }

    @Override
    public dt peek() {
        return null;
    }

    @Override
    public void push(dt dt) {

    }

    @Override
    public dt pop() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<dt> descendingIterator() {
        return null;
    }

    @Override
    public ListIterator<dt> listIterator(int index) {
        return null;
    }


}
