package javapractise;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest 
{
	/**
	 * Function is use to create the simple stack with 3 elements
	 */
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode()
	{
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> myNode = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode,myNode);
	}
	/**
	 * this function is use to pop the element until all the elements get poped.
	 */
	@Test
	public void given3NumbersInStackWhenPopedShouldMatchWithLastAddNode()
	{
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.pop();
        myStack.pop();
        myStack.pop();
        INode peak = myStack.peak();
        Assert.assertEquals(null, peak);	
	}

}
