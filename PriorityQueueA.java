package com.advance.linkedlist;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueA {

	public static void main(String[] args) {
		Queue<Integer> bankQueueNumbers=new PriorityQueue<>();
		   bankQueueNumbers.add(34);
		   bankQueueNumbers.offer(32);
		   bankQueueNumbers.offer(31);
		   bankQueueNumbers.offer(33);
		   bankQueueNumbers.offer(30);
		   System.out.println(bankQueueNumbers);
		   
		   System.out.println("queue first number:" +bankQueueNumbers.element());
		   System.out.println("customer with number" +bankQueueNumbers.remove()+ "is called.");
		   System.out.println(bankQueueNumbers);
		   
		   System.out.println("customer with number" +bankQueueNumbers.poll()+ "is called.");
		   System.out.println(bankQueueNumbers);
		   
		   bankQueueNumbers.remove(33);
		   System.out.println("33 number is removed from queue");
		   System.out.println(bankQueueNumbers);
		   

	}

}
