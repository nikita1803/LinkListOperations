package javapractise;

public class MyLinkedList<k>
{
	public INode head;
	public INode tail;
	/**
	 * constructor of the class
	 */
	MyLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	/**
	 * function add is use to add the value in the linked list
	 * @param newNode
	 */
	public void add(INode newNode)
	{
		if(this.tail == null)
		{
			this.tail = newNode;
		}
	
		if(this.head == null)
		{
			this.head = newNode;
		}
		else
		{
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	/**
	 * append function is use to append the data in the linked list
	 * @param myNode
	 */
	public void append(INode myNode)
	{
		if(this.head == null)
		{
			this.head = myNode;
		}
		if(this.tail == null)
		{
			this.tail = myNode;
		}
		else
		{
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	/**
	 * Insert is a function which is use to insert the element between head and tail.
	 * @param myNode
	 * @param newNode
	 */
	public void Insert(INode myNode , INode newNode)
	{
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	/**
	 * pop is a function which is use to delete the 1st element .
	 * @return
	 */
	public INode pop()
	{
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	/**
	 * popLast is a function use to delete the last element from the list
	 * @return 
	 */
	public INode popLast() 
	{
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) 
        {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = null;
        return tempNode;
    }
	/**
	 * Search is a function which is use to search the element
	 * @param myNode
	 */
	public void search(INode myNode) 
	{
        INode tempNode = head;
        while (tempNode.getNext() != myNode) 
        {
            tempNode = tempNode.getNext();
        }
        tempNode = tempNode.getNext();
        System.out.println("Searched Element is: " + tempNode.getKey());
    }
	/*
	 * delete function is use to delete the element 40 from the linked list
	 */
	public void delete(INode deleteNode) 
	{
        INode tempNode = head;
        while (tempNode.getNext() != deleteNode) 
        {
            tempNode = tempNode.getNext();
        }
        INode tempNode2 = tempNode;
        tempNode = tempNode.getNext();
        tempNode = tempNode.getNext();
        tempNode2.setNext(tempNode);
    }
	public void sortList()
    {
  
        // Node current will point to head
        INode current = head, index = null;
  
        INode temp;
  
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.getNext();
  
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                	current = (INode) current.getKey();
                	index =  (INode) index.getKey();  
                    if (current.equals(index)) {
                        temp = current;
                        current = index;
                        index = temp;
                    }
  
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }
	/**
	 * this is a function use to print the nodes of the linked list
	 */
	public void printMyNodes()
	{
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while(tempNode.getNext() != null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
    
             
}
