package workingPackage;

import library.IntNode;

public class intrusionDetectorClass {

	static IntNode head = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prj1 is running.\n");
		
		
		head = new IntNode(13, 230185386, head);		
	    head.displayNodeData(head);
		
	    removeDuplicate(13);
		if (head != null)
	       head.displayNodeData(head);
		else
		{
		   System.out.print("The linked list is empty.\n");
		   System.out.print(" \n");
		}
		addNodeInOder(13, 308329763);
	    head.displayNodeData(head);
	    
		removeDuplicate(14); 
	    head.displayNodeData(head);
		addNodeInOder(14, 248041794);
	    head.displayNodeData(head);
	    
		removeDuplicate(14); 
	    head.displayNodeData(head);
		addNodeInOder(14, 295106305);
	    head.displayNodeData(head);
	    
		removeDuplicate(15); 
	    head.displayNodeData(head);
		addNodeInOder(15, 325615905);
	    head.displayNodeData(head);
	    
		removeDuplicate(16); 
	    head.displayNodeData(head);
		addNodeInOder(16, 652976466);
	    head.displayNodeData(head);
	    
		removeDuplicate(17); 
	    head.displayNodeData(head);
		addNodeInOder(17, 847897267);
	    head.displayNodeData(head);

		removeDuplicate(17); 
	    head.displayNodeData(head);
		addNodeInOder(17, 927847798);
	    head.displayNodeData(head);
	  
	    System.out.println("End of run.\n");
 
	}
	
	
	// Precondition: head refers the first node in the linked list, or is null when the linked list is empty.
	// The linked list contains at least one element.
	// Postcondition: If the linked list contains a node with sequenceNumber equal to target, 
	// then that node is removed from the linked list. Otherwise, no changes are made.
	public static IntNode removeDuplicate(int target)   
	{
	    if (head == null)
	    	return head;
		
		System.out.println("Running removeDuplicate() on target " + target + "\n");
		
		IntNode previous = null;
		
	    if (target == head.getsequenceNumber())
	    {
	    	head = head.getLink();
	    }	
	    else
	        previous = head.findPrevious(head, target);
	    
	    if (previous != null) 
	        previous.removeNodeAfter();
	    	    
	    return head;
	} 
	
	
	// Precondition: head refers the first node in the linked list, or is null when the linked list is empty.
	// Postcondition: A new node with attributes target and data is created. Target serves as sequenceNumber.
	// The new node is added to the linked list so that its sequenceNumber preserves the ascending order of the linked list
	// relative to the sequenceNumber.
	public static IntNode addNodeInOder(int target, int data)   
	{
        IntNode previous = null;
		
        System.out.println("Running addNodeInOrder() on target " + target + " and data " + data + "\n");
        
        if (head == null)
        {
           head = new IntNode(target, data, head);	
           return head;	
        }
        
        if (target < head.getsequenceNumber())
        	head = new IntNode(target, data, head);
        else
		    previous = head.locatePredecessor(head, target);
		
		if (previous != null)
		   previous.addNodeAfter(target, data);
		
		return head;
	}


}


