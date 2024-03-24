package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    List<String> linkedList;

    @Before
    public void setup(){
         linkedList = new SinglyLinkedList<>();
    }

    @Test
    public void testAdd(){

        // When
        String toAdd = "This has been added";
        linkedList.add(toAdd);


        // Then
        Assert.assertTrue(linkedList.contains(toAdd));
    }

    @Test
    public void testAdd2(){
        int expected = linkedList.size() + 1;

        // When
        String toAdd = "This has been added";
        linkedList.add(toAdd);
        int actual = linkedList.size();


        // Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemove(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
    @Test
    public void testContains(){
        // Given
        List<String> linkedList = new SinglyLinkedList<>();

        // When
        String toAdd = "This has been added";
        String addThis = "This has also been added";
        linkedList.add(toAdd);


        // Then
        Assert.assertTrue(linkedList.contains(toAdd));
        Assert.assertTrue(linkedList.contains(addThis));
    }
    @Test
    public void testFind(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
    @Test
    public void testSize(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
    @Test
    public void testGet(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
    @Test
    public void testCopy(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
    @Test
    public void testSort(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
    @Test
    public void testReverse(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
    @Test
    public void testSlice(){
        List<String> linkedList = new SinglyLinkedList<>();

        // When

        // Then
    }
}
