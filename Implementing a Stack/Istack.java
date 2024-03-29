package stack;
/**
 * Interface defines a generic stack
 * @author Kirk Fay
 *
 * @param <T>
 */
public interface IStack<T>
{
	public boolean isEmpty();
	public void push(T item);
	public T pop();
	public T top();
}
