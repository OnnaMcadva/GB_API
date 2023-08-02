package org.example.lesson4;

import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> reversed = new LinkedList<>();
        for (Object o : ll) {
            reversed.addFirst(o);
        }
        return reversed;
    }
}

/*
Мой варик
class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
    {
        LinkedList<Object> revLinkedList = new LinkedList<Object>();
        for (int i = ll.size() - 1; i >= 0; i--) {

             revLinkedList.add(ll.get(i));
        }
        return revLinkedList;
    }
}
}
*/