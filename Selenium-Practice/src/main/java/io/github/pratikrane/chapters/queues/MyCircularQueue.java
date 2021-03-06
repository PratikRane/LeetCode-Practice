package io.github.pratikrane.chapters.queues;

public class MyCircularQueue {

	int[] queue;
	int head = -1, tail = -1, count = 0;

	/** Initialize your data structure here. Set the size of the queue to be k. */
	public MyCircularQueue(int k) {
		queue = new int[k];
	}

	/**
	 * Insert an element into the circular queue. Return true if the operation is
	 * successful.
	 */
	public boolean enQueue(int value) {
		if (isFull())
			return false;
		tail = (tail + 1) % queue.length;
		queue[tail] = value;
		count = count + 1;
		if (count == 1)
			head = tail;
		return true;
	}

	/**
	 * Delete an element from the circular queue. Return true if the operation is
	 * successful.
	 */
	public boolean deQueue() {
		if (isEmpty())
			return false;
		count = count - 1;
		if (count == 0) {
			head = -1;
			tail = -1;
		} else {
			head = (head + 1) % queue.length;
		}
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if (isEmpty())
			return -1;
		return queue[head];
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if (isEmpty())
			return -1;
		return queue[tail];
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		if (count == 0)
			return true;
		return false;
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		if (count == queue.length)
			return true;
		return false;
	}
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k); boolean param_1 =
 * obj.enQueue(value); boolean param_2 = obj.deQueue(); int param_3 =
 * obj.Front(); int param_4 = obj.Rear(); boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */