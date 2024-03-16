package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;
import java.util.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<DataType> extends AbstractSequentialList<DataType>
                                        implements List<DataType>{
    private int size = 0;
    Node<DataType> head;
    Node<DataType> tail;

    SinglyLinkedList(){
         head = new Node<DataType>(null, null); // Declares the head to be null
                                                             // since no head was provided
         tail = head; // Sets tail to head since there isn't more than one item
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ListIterator<DataType> listIterator(int index) {
        return null;
    }

    private static class Node<DataType> {
        DataType item;
        Node<DataType> next;

        Node(DataType element, Node<DataType> next) {
            this.item = element;
            this.next = next;
        }
    }
}
