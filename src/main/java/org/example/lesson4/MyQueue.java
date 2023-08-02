package org.example.lesson4;

import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public MyQueue() {
    }

    public MyQueue(LinkedList<T> elements) {
        this.elements = elements;
    }

    public void enqueue(T element){
        elements.add(element);
    }

    public T dequeue(){
        T first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public T first(){
        return elements.getFirst();
    }

    public LinkedList<T> getElements() {
        return elements;
    }

    public void setElements(LinkedList<T> elements) {
        this.elements = elements;
    }
}

/*
Мой варик
class MyQueue<T> {
        // хранилище
        private LinkedList<T> storage = new LinkedList<T> ();

    public void enqueue(T element){
        // помещает элемент в конец очереди
        storage.addLast(element);
    }

    public T dequeue(){
        // возвращает первый элемент из очереди и удаляет его
        T out = storage.getFirst();
        storage.removeFirst();
        return out;
    }

    public T first(){
        // возвращает первый элемент из очереди, не удаляя
        return storage.getFirst();
    }

    public LinkedList<T> getElements() {
        // возвращает все элементы в очереди
        return storage;
    }
}
*/