package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        ArrayList<String> mergedArray = new ArrayList<>(firstList);
        mergedArray.addAll(secondList);
        PriorityQueue<String> pq = new PriorityQueue<>(10, (o1, o2) -> o2.compareTo(o1));
        pq.addAll(mergedArray);

        return pq;
    }
}
