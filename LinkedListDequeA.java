package com.advance.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeA {

	public static void main(String[] args) {
		Deque<Integer> bankQueueNumbers=new LinkedList<>();
		   bankQueueNumbers.addLast(30);
		   bankQueueNumbers.offerLast(31);
		   bankQueueNumbers.addFirst(32);
		   bankQueueNumbers.offerFirst(33);
		   bankQueueNumbers.offer(34);
		   System.out.println(bankQueueNumbers);
		   
		   System.out.println("queue first number:" +bankQueueNumbers.getFirst());
		   System.out.println("customer with number" +bankQueueNumbers.removeFirst()+ "is called.");
		   System.out.println(bankQueueNumbers);
		   
		   System.out.println("customer with number" +bankQueueNumbers.pollLast()+ "is called.");
		   System.out.println(bankQueueNumbers);
		   
		   bankQueueNumbers.remove(33);
		   System.out.println("33 number is removed from queue");
		   System.out.println(bankQueueNumbers);
		   

	}

}
