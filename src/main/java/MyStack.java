
public class MyStack<T>
{
	class Node
	{
		private T val;
		private Node next;
		public Node(T val, Node next)
		{
			this.val=val;
			this.next=next;
		}
	}
	Node head = null;
	
	public MyStack()
	{
		
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		head = new Node(val,head);
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{
		if (head==null)
		{
			throw new StackUnderFlowException();
		}
		return head.val;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		if (head==null)
		{
			throw new StackUnderFlowException();
		}
		T popped = head.val;
		head=head.next;
		return popped;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		if (head==null)
		{
			return true;
		}
		return false;
	}

}