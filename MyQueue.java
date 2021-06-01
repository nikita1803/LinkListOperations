package javapractise;

public class MyQueue 
{
	private final MyLinkedList myLinkedList ;
	/**
	 * This is the constructor of the class
	 */
    public MyQueue() 
    {
        this.myLinkedList = new MyLinkedList();
    }
    /**
     * enqueue is a function which will internally call append method on linked list
     * @param myNode
     */
    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }
    /**
     * printQueue is a function use to print the element of the queue.
     */
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
    /**
     * peak function is use to return the top element of the queue.
     * @return
     */
    public INode peak() {
        return myLinkedList.head ;

    }
    /**
     * dequeue is a function which is use to remove the element from the queue
     */
    public void dequeue() {
        myLinkedList.pop();
    }
}
