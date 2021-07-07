package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		// instead of LinkedList we are using PriorityQueue
		queue = new PriorityQueue<Integer>();
		queue.add(50);
		queue.add(10);
		queue.add(30);
		queue.add(20);
		queue.add(40);
		System.out.println(queue);
		// FIFO or Sorted Order based on the implementation
		queue.poll();
		System.out.println(queue);
	}
}
