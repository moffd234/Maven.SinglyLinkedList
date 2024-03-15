package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;
import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<DataType> extends AbstractSequentialList<DataType>
                                        implements List<DataType> {
    int size = 0;

    SinglyLinkedList(){

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ListIterator<DataType> listIterator(int index) {
        return null;
    }
}
