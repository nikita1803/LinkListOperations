package javapractise;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest 
{
	/**
	 * this function is used to create simple linked list and added 3 numbers
	 */
	@Test
	public void given3NumberToLinkedListToBeAdded()
	{
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		
	}
	
	/**
	 * this function is use to insert the value in the linked list
	 */
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop()
	{
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	/**
	 * this function is use to append the linked list
	 */
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToLast()
	{
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	/**
	 * this is the function which is use to insert the value between head and tail
	 */
	@Test
	public void given3NumberWhenInsertSecondBetweenShouldPassLinkedListResult()
	{
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.Insert(myFirstNode,mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	/**
	 * this is the function which is use to delete the 1st element in the linked list
	 */
	@Test
	public void given3NumberWhenDeleteFirstElementShouldPassLinkedListResult()
	{
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.head.equals(myFirstNode);
		myLinkedList.pop();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(mySecondNode) &&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	/**
	 * this is the function which is use to delete the last element in the linked list
	 */
	@Test
    public void given3Number_WhenDeletedLastElement_ShouldPassTheLinkedListTest() 
	{
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myThirdNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myFirstNode);
        myLinkedList.popLast();
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                		 myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }
	/**
	 * This is the function which is use to search the element 
	 */
	 @Test
	 public void given3NumberWhenSearchElement_ShouldPassTheLinkedListTest() 
	 {
	    MyNode<Integer> myFirstNode = new MyNode<>(56);
	    MyNode<Integer> mySecondNode = new MyNode<>(30);
	    MyNode<Integer> myThirdNode = new MyNode<>(70);

	    MyLinkedList myLinkedList = new MyLinkedList();
	    myLinkedList.add(myThirdNode);
	    myLinkedList.add(mySecondNode);
	    myLinkedList.add(myFirstNode);

	    myLinkedList.search(mySecondNode);
	    myLinkedList.printMyNodes();

	    boolean result = myLinkedList.head.equals(myFirstNode) &&
	                	 myLinkedList.head.getNext().equals(mySecondNode) &&
	                	 myLinkedList.tail.equals(myThirdNode);
	        Assert.assertTrue(result);
	 }
	 /**
	  * this function is use to insert the element 40 after 30
	  */
	 
	 @Test
	 public void given3NumberToInsert40After30_ShouldPassTheLinkedListTest() 
	 {
	    MyNode<Integer> myFirstNode = new MyNode<>(56);
	    MyNode<Integer> mySecondNode = new MyNode<>(30);
	    MyNode<Integer> myThirdNode = new MyNode<>(40);
	    MyNode<Integer> myFourthNode = new MyNode<>(70);

	    MyLinkedList myLinkedList = new MyLinkedList();
	    myLinkedList.add(mySecondNode);
	    myLinkedList.add(myFirstNode);
	    myLinkedList.append(myFourthNode);
	    myLinkedList.search(mySecondNode);
	    myLinkedList.printMyNodes();
	    myLinkedList.Insert(mySecondNode, myThirdNode);
	    myLinkedList.printMyNodes();

	    boolean result = myLinkedList.head.equals(myFirstNode) &&
			             myLinkedList.head.getNext().equals(mySecondNode) &&
			             myLinkedList.head.getNext().getNext().equals(myThirdNode) &&
			             myLinkedList.tail.equals(myFourthNode);
	        Assert.assertTrue(result);
	    }
	 
	 /**
	  * this function is use to delete the element 40 from the link list
	  */
	   @Test
	    public void given3Number_ToDeleteElement40__ShouldPassTheLinkedListTest() 
	   {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(40);
	        MyNode<Integer> myFourthNode = new MyNode<>(70);

	        MyLinkedList myLinkedList = new MyLinkedList();
	        myLinkedList.append(myFirstNode);
	        myLinkedList.append(mySecondNode);
	        myLinkedList.append(myThirdNode);
	        myLinkedList.append(myFourthNode);
	        myLinkedList.search(myThirdNode);
	        myLinkedList.delete(myThirdNode);
	        myLinkedList.printMyNodes();
	        
	        boolean result = myLinkedList.head.equals(myFirstNode) &&
	                myLinkedList.head.getNext().equals(mySecondNode) &&
	                myLinkedList.tail.equals(myFourthNode);
	        Assert.assertTrue(result);
	    }


}
