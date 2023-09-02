package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < 2; i++) {
            stack.add(firstQueue.remove());
        }
        for (int i = 0; i < 2; i++) {
            stack.add(secondQueue.remove());
        }

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.offer(stack.pollLast());
            for (int i = 0; i < 2; i++) {
                stack.add(firstQueue.remove());
            }

            secondQueue.offer(stack.pollLast());
            for (int i = 0; i < 2; i++) {
                stack.add(secondQueue.remove());
            }
        }
        return stack;
    }
}
