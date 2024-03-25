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
    SinglyLinkedList<Integer> intLinkedList;

    @Before
    public void setup(){
         linkedList = new SinglyLinkedList<>();
         intLinkedList = new SinglyLinkedList<>();
    }
    @Test
    public void testConstructor(){
        SinglyLinkedList<String> l = new SinglyLinkedList<>("Initial value");
        int expected = 1;
        int actual = l.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorInts(){
        SinglyLinkedList<Integer> l = new SinglyLinkedList<>(1);
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
    public void testConstructorInteger2(){
        Integer initVal = 1;
        SinglyLinkedList<Integer> l = new SinglyLinkedList<>(initVal);

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
    public void testAddInteger(){

        // When
        Integer toAdd = 1;
        intLinkedList.add(toAdd);


        // Then
        Assert.assertTrue(intLinkedList.contains(toAdd));
    }

    @Test
    public void testAddInteger2(){
        int expected = intLinkedList.size() + 1;

        // When
        Integer toAdd = 1;
        intLinkedList.add(toAdd);
        int actual = intLinkedList.size();


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
    public void testRemoveInteger(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);

        // When
        intLinkedList.remove((Integer) 1);
        boolean actual = intLinkedList.contains(1);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void testRemoveEmpty(){

        // When
        boolean actual = linkedList.remove("Hello");

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void testRemoveEmptyInt(){

        // When
        boolean actual = intLinkedList.remove((Integer) 1);

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
    public void testContainsInteger(){
        // Given
        Integer toAdd = 1;
        Integer addThis = 240;

        // When
        intLinkedList.add(toAdd);
        intLinkedList.add(addThis);

        // Then
        Assert.assertTrue(intLinkedList.contains(toAdd));
        Assert.assertTrue(intLinkedList.contains(addThis));
    }

    @Test
    public void peekFirst(){
        String shouldBeNull = linkedList.peekFirst();
        Assert.assertNull(shouldBeNull);
    }

    @Test
    public void peekFirstInteger(){
        Integer shouldBeNull = intLinkedList.peekFirst();
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
    public void peekFirstInteger2(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        Integer expected = 1;

        // When
        Integer actual = intLinkedList.peekFirst();

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
    public void testPeekLastInteger(){
        Integer shouldBeNull = intLinkedList.peekLast();
        Assert.assertNull(shouldBeNull);
    }

    @Test
    public void peekLast2Integer(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        Integer expected = 2;

        // When
        Integer actual = intLinkedList.peekLast();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFind(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Listy");

        int expected = 2;

        // When
        int actual = linkedList.find("My");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFind2(){

        // When
        Integer actual = linkedList.find("My");

        // Then
        Assert.assertNull(actual);
    }

    @Test
    public void testFindInteger(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);

        int expected = 1;

        // When
        int actual = intLinkedList.find(2);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindInteger2(){

        // When
        Integer actual = intLinkedList.find(1);

        // Then
        Assert.assertNull(actual);
    }

    @Test
    public void testSize(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Listy");

        int expected = 6;

        // When
        int actual = linkedList.size();

        // Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testSize2(){
        // Given
        int expected = 0;

        // When
        int actual = linkedList.size();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSizeInteger(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);

        int expected = 6;

        // When
        int actual = intLinkedList.size();

        // Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testSizeInteger2(){
        // Given
        int expected = 0;

        // When
        int actual = linkedList.size();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGet(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Listy");

        String expected = "Is";

        // When
        String actual = linkedList.get(4);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNull(){

        String expected = null;

        // When
        String actual = linkedList.get(0);

        // Then
        Assert.assertNull(actual);
    }


    @Test
    public void testGetInteger(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);

        Integer expected = 5;

        // When
        Integer actual = intLinkedList.get(4);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNullIntegerList(){

        // When
        Integer actual = intLinkedList.get(0);

        // Then
        Assert.assertNull(actual);
    }

    @Test
    public void testShallowCopyInteger(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);

        // When
        SinglyLinkedList<Integer> newList = intLinkedList.sCopy();

        // Then
        for(int i = 0; i < intLinkedList.size(); i++){
            Integer newListVal = newList.get(i);
            Integer linkedListVal = intLinkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
    }


    @Test
    public void testShallowCopy2(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Listy");

        // When
        SinglyLinkedList<String> newList = linkedList.sCopy();

        // Then
        for(int i = 0; i < newList.size(); i++){
            String newListVal = newList.get(i);
            String linkedListVal = linkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
    }

    @Test
    public void testShallowCopy3(){

        // When
        SinglyLinkedList<String> newList = linkedList.sCopy();

        // Then
        for(int i = 0; i < newList.size(); i++){
            String newListVal = newList.get(i);
            String linkedListVal = linkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
    }

    @Test
    public void testDeepCopy(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Listy");

        // When
        SinglyLinkedList<String> newList = linkedList.dCopy();

        // Then
        for(int i = 0; i < linkedList.size(); i++){
            String newListVal = newList.get(i);
            String linkedListVal = linkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
        newList.add("ADDED THIS");
        Assert.assertFalse(linkedList.contains("ADDED THIS"));
    }

    @Test
    public void testShallowCopy(){
        // Given
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Listy");

        // When
        SinglyLinkedList<String> newList = linkedList.sCopy();

        // Then
        for(int i = 0; i < linkedList.size(); i++){
            String newListVal = newList.get(i);
            String linkedListVal = linkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
    }


    @Test
    public void testShallowCopyInteger2(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);

        // When
        SinglyLinkedList<Integer> newList = intLinkedList.sCopy();

        // Then
        for(int i = 0; i < newList.size(); i++){
            Integer newListVal = newList.get(i);
            Integer linkedListVal = intLinkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
    }

    @Test
    public void testShallowCopyInteger3(){

        // When
        SinglyLinkedList<Integer> newList = intLinkedList.sCopy();

        // Then
        for(int i = 0; i < newList.size(); i++){
            Integer newListVal = newList.get(i);
            Integer linkedListVal = intLinkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
    }

    @Test
    public void testDeepCopyInteger(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);

        // When
        SinglyLinkedList<Integer> newList = intLinkedList.dCopy();

        // Then
        for(int i = 0; i < intLinkedList.size(); i++){
            Integer newListVal = newList.get(i);
            Integer linkedListVal = intLinkedList.get(i);
            Assert.assertEquals(newListVal, linkedListVal);
        }
        newList.add(59038290);
        Assert.assertFalse(intLinkedList.contains(59038290));
    }

    @Test
    public void testSort() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList<>();
        linkedList1.add(5);
        linkedList1.add(2);
        linkedList1.add(8);
        linkedList1.add(1);
        linkedList1.add(3);
        SinglyLinkedList<Integer> sortedList = linkedList1.sort();
        Assert.assertEquals("1, 2, 3, 5, 8", sortedList.toString());
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
    @Test
    public void testToStringInteger(){
        // Given
        intLinkedList.add(1);
        intLinkedList.add(2);
        String expected = "1, 2";

        // When
        String output = intLinkedList.toString();

        // Then
        Assert.assertEquals(expected, output);
    }
}
