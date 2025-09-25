
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestStack
{
	MyStack<String> stack1 = new MyStack<String>();
	MyStack<String> stack2 = new MyStack<String>();
	MyStack<String> stack3= new MyStack<String>();
	MyStack<String> stack4= new MyStack<String>();
	MyStack<String> stack5= new MyStack<String>();


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
		assertEquals("Marie",stack3.pop());
		assertThrows(StackUnderFlowException.class,
				()-> {
					stack3.pop();
				});
		stack5.push("Olivia");
		stack5.push("Marie");
		stack5.push("Barker");
		assertEquals("Barker",stack5.pop());
		assertEquals("Marie",stack5.pop());

	}
	
	@Test
	void isEmptyTest()
	{
		assertTrue(stack4.isEmpty());
		stack4.push("Hello!");
		assertFalse(stack4.isEmpty());
	}
	
	
	
}
