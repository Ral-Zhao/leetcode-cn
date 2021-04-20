package designLinkedList_707;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        //int val = list.get(0);
        //Assert.assertEquals(-1, val);
        //list.addAtHead(1);
        //list.addAtTail(3);
        //list.addAtIndex(1, 2);
        //list.deleteAtIndex(2);
        //Assert.assertEquals(2, list.get(1));
        list.addAtIndex(0,1);
        list.addAtHead(-5);
        list.addAtIndex(2,3);
        list.addAtIndex(1,2);
        list.addAtTail(4);
        list.addAtHead(0);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println("============-0");
        list.deleteAtIndex(5);
        System.out.println(list.get(4));
        list.deleteAtIndex(4);
        System.out.println(list.get(3));
        list.deleteAtIndex(3);
        System.out.println(list.get(2));
        list.deleteAtIndex(2);
        System.out.println(list.get(1));
        list.deleteAtIndex(1);
        System.out.println(list.get(0));
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        System.out.println("============");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
