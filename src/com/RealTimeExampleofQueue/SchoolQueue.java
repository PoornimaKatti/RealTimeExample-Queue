package com.RealTimeExampleofQueue;
import java.util.LinkedList;
import java.util.ArrayList;

class SchoolQueue {
    private LinkedList<String> linkedListQueue;
    private ArrayList<String> arrayListQueue;

    public SchoolQueue() {
        linkedListQueue = new LinkedList<>();
        arrayListQueue = new ArrayList<>();
    }

    // Enqueue operation for LinkedList with height
    public void enqueueLinkedList(String student, int height) {
        // For simplicity, we assume higher height values represent shorter students
        linkedListQueue.addLast(student + " (Height: " + height + ")");
    }

    // Enqueue operation for ArrayList with height
    public void enqueueArrayList(String student, int height) {
        // For simplicity, we assume higher height values represent shorter students
        arrayListQueue.add(student + " (Height: " + height + ")");
    }

    // Dequeue operation for LinkedList
    //After the dequeue operations,
    // the updated state of the queues is displayed.
    // The students Poornima and Sushma have been dequeued from
    // the LinkedList and ArrayList queues, respectively.
    // The order in which students are dequeued reflects the FIFO (First-In-First-Out) behavior of the queues.
    public String dequeueLinkedList() {
        if (linkedListQueue.isEmpty()) {
            return null;
        }
        return linkedListQueue.removeFirst();
    }

    // Dequeue operation for ArrayList
    public String dequeueArrayList() {
        if (arrayListQueue.isEmpty()) {
            return null;
        }
        return arrayListQueue.remove(0);
    }

    // Display the current state of the queues
    public void displayQueues() {
        System.out.println("LinkedList Queue: " + linkedListQueue);
        System.out.println("ArrayList Queue : " + arrayListQueue);
        System.out.println();
    }

    public static void main(String[] args) {
        SchoolQueue schoolQueue = new SchoolQueue();

        // Enqueue students to both LinkedList and ArrayList queues with height
        schoolQueue.enqueueLinkedList("Poornima", 160);
        schoolQueue.enqueueArrayList("Sushma", 155);
        schoolQueue.enqueueLinkedList("Arunima", 150);
        schoolQueue.enqueueArrayList("Gouri", 145);

        // Display the initial state of the queues
        schoolQueue.displayQueues();

        // Dequeue some students from both queues
        System.out.println("Dequeue operations:");
        System.out.println("Dequeued from LinkedList: " + schoolQueue.dequeueLinkedList());
        System.out.println("Dequeued from ArrayList : " + schoolQueue.dequeueArrayList());

        // Display the updated state of the queues
        schoolQueue.displayQueues();
    }
}
