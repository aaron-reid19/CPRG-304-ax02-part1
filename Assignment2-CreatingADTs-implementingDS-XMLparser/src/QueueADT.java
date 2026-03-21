/**
 * QueueADT.java
 * 
 * Defines the public contract for a queue abstract data type.
 * A queue stores elements in FIFO order (First-In, First-Out).
 * 
 * @param <E> the type of elements stored in the queue
 */

public interface QueueADT<E>{
	void enqueue(E element);
	E dequeue();
	
	/**
     * Returns the number of elements currently stored in the queue.
     *
     * <p><b>Pre-condition:</b> None.</p>
     *
     * <p><b>Post-condition:</b> The queue remains unchanged.</p>
     *
     * @return the number of elements in the queue
     */
	E peek();
	boolean isEmpty();
	int size();
	void dequeueAll();
	
}
