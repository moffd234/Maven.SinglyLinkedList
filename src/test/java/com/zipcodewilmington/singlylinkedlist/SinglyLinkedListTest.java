package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testAdd(){
        // Given
        List<String> linkedList = new SinglyLinkedList<>();

        // When
        String toAdd = "This has been added";
        linkedList.add(toAdd);


        // Then
        Assert.assertTrue(linkedList.contains(toAdd));
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
