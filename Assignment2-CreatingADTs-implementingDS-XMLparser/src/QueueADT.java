/**
 * QueueADT.java
 * 
 * Defines the public contract for a queue abstract data type.
 * A queue stores elements in FIFO order (First-In, First-Out).
 * 
 * @param <E> the type of elements stored in the queue
 */

public interface QueueADT<E>{
	
	/**
	 * Adds an Element to the end of the Queue.
	 * 
	 * <p><b>Pre-condition:</b> A Queue must exist.</p>
	 * 
	 * <p><b>Post-condition:</b> The Element is added to the end of the Queue.</p>
	 *
	 * @param element which is intended to be added to the Queue.
	 * @throws NullPointerException if attempting to pass a null value.
	 */
	void enqueue(E element); 
	
	/**
	 * Removes an element from the start of the Queue.
	 * 
	 * <p><b>Pre-condition:</b> A Queue must exist.</p>
	 * 
	 * <p><b>Post-condition:</b> The Element is removed from the start of the Queue.</p>
	 *
	 * @param element which is intended to be removed to the Queue.
	 * @throws NullPointerException if attempting to pass a null value.
	 */
	E dequeue();
	
	/**
	 * Returns the Element located at the front of the Queue.
	 * 
	 * <p><b>Pre-condition:</b> A Queue must exist.</p>
	 * 
	 * <p><b>Post-condition:</b> No change is made to the Queue.</p>
	 * 
	 * @throws NoSuchElementException if the Queue is empty.
	 * @return element from the front of the Queue.
	 */
	E peek();

	/**
	 * Returns true if the Queue has no Elements.
	 * 
	 * <p><b>Pre-condition:</b> A Queue must exist.</p>
	 * 
	 * <p><b>Post-condition:</b> No change is made to the Queue.</p>
	 * 
	 * @return true if the Queue is empty; false otherwise
	 */
	boolean isEmpty();
	
	/**
     * Returns the number of elements currently stored in the Queue.
     *
     * <p><b>Pre-condition:</b> None.</p>
     *
     * <p><b>Post-condition:</b> The Queue remains unchanged.</p>
     *
     * @return the number of elements in the Queue
     */
	int size(); 
	
	/**
	 * Removes every element from the Queue.
	 * 
	 * <p><b>Pre-condition:</b> Queue must exist </p>
	 * 
	 * <p><b>Post-condition:</b> All elements are removed from the Queue. </p>
	 * 
	 */
	void dequeueAll(); 
	
}
