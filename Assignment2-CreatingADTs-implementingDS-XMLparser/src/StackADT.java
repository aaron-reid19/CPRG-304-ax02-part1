
public interface StackADT<E> {

	void push(E element);
	E pop();
	E peek();
	boolean isEmpty();
	int size();
	boolean contains(E element);
	E[] toArray();
}
