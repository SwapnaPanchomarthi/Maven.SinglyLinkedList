package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    //SinglyLinkedList slg = new SinglyLinkedList();
  SingleLinkedList1 slg = new SingleLinkedList1();


   @Test
    public void add() {
     Object data="one";
     Object data1 ="two";
     int index=1;
       slg.add((Comparable) data);
       slg.add((Comparable) data1);
       int actual = slg.size;
    Assert.assertEquals(2, actual);


    }



    @Test
    public void remove() {

     Object data="one";
     Object data1 ="two";
     Object data2="three";
     Object data4="four";

     int index=1;
        slg.add((Comparable) data);
        slg.add((Comparable) data1);
        slg.add((Comparable) data2);
        slg.add((Comparable) data4);
     slg.remove(1);
     int actual =slg.size();
  Assert.assertEquals(3, actual);

    }


    @Test
    public void containsTest1() throws Exception{
     Object data="one";
     Object data1 ="two";
     Object data2="three";
     Object data4="four";

     int index=1;
        slg.add((Comparable) data);
        slg.add((Comparable) data1);
        slg.add((Comparable) data2);
        slg.add((Comparable) data4);

     Assert.assertTrue(slg.contains((Comparable) data));
    }

 @Test
 public void containsTest2() throws Exception{
  Object data="one";
  Object data1 ="two";
  Object data2="three";
  Object data4="four";
  Object data5="Five";

  int index=1;
     slg.add((Comparable) data);
     slg.add((Comparable) data1);
     slg.add((Comparable) data2);
     slg.add((Comparable) data4);

  Assert.assertFalse(slg.contains((Comparable) data5));
 }

    @Test
    public void get()throws Exception {
        Object data = "one";
        Object data1 = "two";
        int index = 1;
        slg.add((Comparable) data);
        slg.add((Comparable) data1);
        Object actual = slg.get(1);
        Assert.assertEquals("two", actual);
    }
        @Test
        public void findTest1() throws Exception {
            Object data = "one";
            Object data1 = "two";
            int index = 1;
            slg.add((Comparable) data);
            slg.add((Comparable) data1);
           int actual= slg.find("one");

           Assert.assertEquals(0, actual);

        }


    @Test
    public void findTest2() throws Exception {

        int actual= slg.find("thress");

        Assert.assertEquals(-1, actual);

    }
        @Test
        public void copy() throws Exception {

            Object data = "one";
            Object data1 = "two";
            Object data2 = "thress";
            int index = 1;
            slg.add((Comparable) data);
            slg.add((Comparable) data1);
            slg.add((Comparable) data2);
            slg.copy();
           int actual= slg.copy().size();
            System.out.println(slg.copy().contains((Comparable) data));
            System.out.println( slg.get(1).toString());
            Assert.assertEquals(3, actual);


        }

    }
