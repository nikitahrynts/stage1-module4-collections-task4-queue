package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);
        return priorityQueue;
    }
}
