package com.example.googlepreperation.java.queue;

import com.example.googlepreperation.java.Employee;

import java.util.NoSuchElementException;

  class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public Employee peak() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(front);
        }
    }

    public int size() {
        return back - front;
    }


}
/*
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(2);
        queue.add(new Employee("Abhishek","Pathak",12));
        queue.add(new Employee("Bill","Micheal",13));


    }*/
