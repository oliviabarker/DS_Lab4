
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestStack
{
	MyStack<String> stack1 = new MyStack<String>();
	MyStack<String> stack2 = new MyStack<String>();
	MyStack<String> stack3= new MyStack<String>();


	@Test
	void pushTest()
	{
		stack1.push("Olivia");
		assertEquals("Olivia", stack1.pop());
	}
	
	@Test
	void topTest()
	{
		stack2.push("Barker");
		assertEquals("Barker",stack2.top());
		assertEquals("Barker",stack2.top());
		stack2.pop();
		assertThrows(StackUnderFlowException.class,
				()-> {
					stack2.top();
				});
	}	
	
	@Test
	void popTest()
	{
		stack3.push("Marie");
		assertEquals("Marie",stack2.pop());

		stack2.pop();
		assertThrows(StackUnderFlowException.class,
				()-> {
					stack2.pop();
				});
	}
	
	@Test
	void isEmptyTest()
	{
		
	}
	
	
	
	
	
}
