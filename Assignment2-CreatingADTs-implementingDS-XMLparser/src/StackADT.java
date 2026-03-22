/**
 * Defines the public contract for a stack abstract data type.
 * A stack stores elements in LIFO order (Last-In, First-Out).
 *
 * @param <E> the type of elements stored in the stack
 */

public interface StackADT<E> {

	void push(E element);
	E pop();
	E peek();
	boolean isEmpty();
	
	/**
     * Returns the number of elements currently stored in the stack.
     *
     * <p><b>Pre-condition:</b> None.</p>
     * <p><b>Post-condition:</b> The stack remains unchanged.</p>
     *
     * @return the number of elements in the stack
     */
	
	int size();
	boolean contains(E element);
	
	/**
     * Returns an array containing all elements currently in the stack.
     *
     * <p><b>Pre-condition:</b> None.</p>
     * <p><b>Post-condition:</b> The stack remains unchanged.</p>
     *
     * @return an array containing all elements in the stack
     */
	E[] toArray();
}
