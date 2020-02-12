package io.github.pratikrane.chapters.queues;

public class Solution {

	public static void main(String[] args) {

		MyCircularQueue obj = new MyCircularQueue(6);
		System.out.println(obj.enQueue(10));
		System.out.println(obj.enQueue(20));
		System.out.println(obj.deQueue());
		System.out.println(obj.Front());
		System.out.println(obj.Rear());
		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());

	}

}
