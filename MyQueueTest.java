package javapractise;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest 
{
	/**
	 * this method is use to create a queue of 3 elements
	 */
	@Test
	public void given3NumberWhenAddedToQueue_ShouldHaveFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

        INode peak;
        peak = myQueue.peak();
        Assert.assertEquals(myFirstNode, peak);
    }
	/**
	 * This is a function which is use to delete/pop the element from the queue
	 */
	@Test
    public void given3NumberWhenAddedToQueue_ShouldDeleteTheNodes() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        
        INode peak;
        peak = myQueue.peak();
        Assert.assertNull(peak);

    }

	

}
