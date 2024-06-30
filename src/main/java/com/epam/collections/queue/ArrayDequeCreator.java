package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(firstQueue.remove());
        arrayDeque.addLast(firstQueue.remove());
        arrayDeque.addLast(secondQueue.remove());
        arrayDeque.addLast(secondQueue.remove());
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) {
                firstQueue.add(arrayDeque.pollLast());
                arrayDeque.addLast(firstQueue.remove());
                arrayDeque.addLast(firstQueue.remove());
            }
            if (!secondQueue.isEmpty()) {
                secondQueue.add(arrayDeque.pollLast());
                arrayDeque.addLast(secondQueue.remove());
                arrayDeque.addLast(secondQueue.remove());
            }
        }
        return arrayDeque;
    }
}
