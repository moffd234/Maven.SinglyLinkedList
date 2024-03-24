package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    SinglyLinkedList<String> linkedList;

    @Before
    public void setup(){
         linkedList = new SinglyLinkedList<>();
    }
    @Test
    public void testConstructor(){
        SinglyLinkedList<String> l = new SinglyLinkedList<>("Initial value");
        int expected = 1;
        int actual = l.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor2(){
        String initVal = "Initial Value";
        SinglyLinkedList<String> l = new SinglyLinkedList<>(initVal);

        boolean actual = l.contains(initVal);
        Assert.assertTrue(actual);
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
        // Given
        linkedList.add("Hello");
        linkedList.add("World");

        // When
        linkedList.remove("Hello");
        boolean actual = linkedList.contains("Hello");

        // Then
        Assert.assertFalse(actual);
    }
    @Test
    public void testContains(){
        // Given
        String toAdd = "This has been added";
        String addThis = "This has also been added";

        // When
        linkedList.add(toAdd);
        linkedList.add(addThis);

        // Then
        Assert.assertTrue(linkedList.contains(toAdd));
        Assert.assertTrue(linkedList.contains(addThis));
    }

    @Test
    public void peekFirst(){
        String shouldBeNull = linkedList.peekFirst();
        Assert.assertNull(shouldBeNull);
    }

    @Test
    public void peekFirst2(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        String expected = "Hello";

        // When
        String actual = linkedList.peekFirst();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeekLast(){
        String shouldBeNull = linkedList.peekLast();
        Assert.assertNull(shouldBeNull);
    }

    @Test
    public void peekLast2(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        String expected = "World";

        // When
        String actual = linkedList.peekLast();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFind(){

        // When

        // Then
    }
    @Test
    public void testSize(){

        // When

        // Then
    }
    @Test
    public void testGet(){

        // When

        // Then
    }
    @Test
    public void testCopy(){

        // When

        // Then
    }
    @Test
    public void testSort(){

        // When

        // Then
    }
    @Test
    public void testReverse(){

        // When

        // Then
    }
    @Test
    public void testSlice(){

        // When

        // Then
    }

    @Test
    public void testToString(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        String expected = "Hello, World";

        // When
        String output = linkedList.toString();

        // Then
        Assert.assertEquals(expected, output);
    }
}
