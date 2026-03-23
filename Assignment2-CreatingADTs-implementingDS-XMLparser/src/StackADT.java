/**
 * Defines the public contract for a stack abstract data type.
 * A stack stores elements in LIFO order (Last-In, First-Out).
 *
 * @param <E> the type of elements stored in the stack
 */

public interface StackADT<E> {

    /**
     * Adds an element to the top of the stack.
     *
     * <p><b>Pre-condition:</b> element is not null.</p>
     * <p><b>Post-condition:</b> element is at the top of the stack, size increases by 1.</p>
     *
     * @param element the value to add to the top of the stack
     * @throws NullPointerException if element is null
     */
    void push(E element);

    /**
     * Removes and returns the element at the top of the stack.
     *
     * <p><b>Pre-condition:</b> The stack is not empty.</p>
     * <p><b>Post-condition:</b> The top element is removed, size decreases by 1.</p>
     *
     * @return the element that was at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    E pop();

    /**
     * Returns the top element without removing it from the stack.
     *
     * <p><b>Pre-condition:</b> The stack is not empty.</p>
     * <p><b>Post-condition:</b> The stack is unchanged.</p>
     *
     * @return the element currently at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    E peek();


    /**
     * Returns true if the stack contains no elements.
     *
     * <p><b>Pre-condition:</b> None.</p>
     * <p><b>Post-condition:</b> The stack is unchanged.</p>
     *
     * @return true if the stack is empty, false otherwise
     */
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
