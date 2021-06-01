package javapractise;

public class MyStack<k> 
{
	private final MyLinkedList<k> myLinkedList;
	/**
	 * Constructor of the class
	 */
	public MyStack()
	{
		myLinkedList = new MyLinkedList<>();
	}
	/**
	 * push is use to add the element
	 * @param element
	 */
	public void push(INode<k> element)
	{
		myLinkedList.add(element);
	}
	/**
	 * this function use to print the stack
	 */
	public void printStack()
	{
		myLinkedList.printMyNodes();
	}
	/**
	 * peak is a function which is use to return the top element
	 */
	public INode<k> peak()
	{
		return myLinkedList.head;
	}
	/**
	 * pop is use to remove the element from the stack
	 * @return
	 */
	public INode<k> pop()
	{
		return myLinkedList.pop();
	}
}
