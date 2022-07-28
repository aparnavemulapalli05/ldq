package com.advance.linkedlist;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueA {

	public static void main(String[] args) {
	   Queue<Integer> bankQueueNumbers=new LinkedList<>();
	   bankQueueNumbers.add(30);
	   bankQueueNumbers.offer(31);
	   bankQueueNumbers.offer(32);
	   bankQueueNumbers.offer(33);
	   bankQueueNumbers.offer(34);
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
