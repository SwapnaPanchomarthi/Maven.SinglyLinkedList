package com.zipcodewilmington.singlylinkedlist;

public class SingleLinkedList1<T extends Comparable<T>>{

    Node head;
    Integer size;
    public SingleLinkedList1(){
        this.head=null;
        this.size=0;

    }

    public void add(T data)
    {
        if(head==null)
            head=new Node(data);
        else {
            Node tempNode = head;
            Node nextNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = new Node(data);
        }


            size++;
    }

    public void remove(int index)

    {
        if(index==0)
        {
            head=head.next;
            size--;
        }
        else
        {


            Node tempNode=head;

            //tempNode.next=head.next;
            for(int i=1; i<index;i++)
            {
               ;
                tempNode=head.getNext();

                System.out.println(tempNode);
            }

           tempNode.setNext(tempNode.getNext().getNext());
            size--;

        }
        System.out.println(size);
    }


    public T get(int index) throws Exception

    {
        Node tempNode=head;
        if(index<0||index>size)
            throw new Exception("Invalid index");

        else
        {
            for(int i=0;i<index;i++)
            {
                tempNode=tempNode.next;
            }
        }
        return (T) tempNode.getData();

    }

    public boolean contains(T data) throws Exception
    {
        for(int i=0;i<size;i++)
        {
            if(data.equals(get(i)))
                return true;

        }
        return false;
    }

    public int size(){
        return size;
    }

    public int find(T data) throws Exception{
        for(int i=0;i<size;i++)
        {
            if(data.equals(get(i)))
                return i;

        }
        return -1;
    }

    public void sort()
    {
        if(size>1)
        {
            for(int i=0;i<size;i++)
            {
                Node currentNode=head;
                Node nextNode=head.next;
               for(int j=0; i<size;j++)
               {
                   if((currentNode.data).compareTo(nextNode.data)>0) {
                       T temp = currentNode.data;
                       currentNode.data = nextNode.data;
                       nextNode.data = temp;
                   }
                   currentNode=nextNode;
                   nextNode=nextNode.next;
               }
            }
        }

    }

    public SingleLinkedList1<T> copy() throws Exception{
        SingleLinkedList1 returnCopy = new SingleLinkedList1();
        Node nodeToCopy=head;
        for(int i=0;i<size;i++)
        {
            returnCopy.add(nodeToCopy.data);
            nodeToCopy=nodeToCopy.next;
        }
        return returnCopy;

    }

    private class Node {


        T data;
        Node next;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        //Constructor
        Node(T data){
            this.data=data;
            this.next=null;
        }



    }
}
