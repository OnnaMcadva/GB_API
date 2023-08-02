package org.example.lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("integerLinkedList.peek() = " + integerLinkedList.peek());
        System.out.println("integerLinkedList = " + integerLinkedList);
        System.out.println("integerLinkedList.pop() = " + integerLinkedList.pop());
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.addFirst(7);
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.addLast(8);
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.set(integerLinkedList.size() / 2, 100);
        System.out.println("integerLinkedList = " + integerLinkedList);
        System.out.println("integerLinkedList.contains(3) = " + integerLinkedList.contains(3));
        integerLinkedList.remove((Integer) 100);
        System.out.println("integerLinkedList = " + integerLinkedList);
        System.out.println("integerLinkedList.indexOf(7) = " + integerLinkedList.indexOf(7));
    }
}
/*
206. Reverse Linked List
https://leetcode.com/problems/reverse-linked-list/description/
 class Solution {
public ListNode reverseList(ListNode head) {
ListNode pred = null;
ListNode current = head;
while(current!=null){
ListNode temp = current.next;
current.next = pred;
pred = current;
current = temp;
}
return pred;
}
}
 */
