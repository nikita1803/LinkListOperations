package javapractise;

public class MyNode<k> implements INode<k>
{
	
	private k key;
	private INode next;
	
	public MyNode(k key) 
	{
		this.key = key;
		this.next = next;
	}
	public k getKey()
	{
		return key;
	}
	public INode getNext() {
		return next;
	}
	public void setKey(k key)
	{
		this.key = key;
	}
	public void setNext(INode next)
	{
		this.next = (MyNode<k>) next;
	}
}
