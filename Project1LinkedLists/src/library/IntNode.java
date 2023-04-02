package library;

public class IntNode {

	   private int sequenceNumber;
	   private int data;
	   private IntNode link;   
	   //single link list

	   
	   // Precondition:
	   // Postcondition: All instance variables of the IntNode class are initialized in order.
	   public IntNode(int initialsequenceNumber, int initialdata, IntNode initialLink)
	   {
	        // Implement me.
		   sequenceNumber = initialsequenceNumber;
		   data = initialdata;
		   link = initialLink;
	   }

	   
	   // Precondition: This instance of the IntNode class exists.
	   // In other words, the object whose method is activated exists as a node in the linked list. 
	   // Postcondition: A new node with attributes item and data is created. Item serves as sequenceNumber.
	   // The new node is added to the linked list at a position that comes immediately after the node whose method is activated.
	   public void addNodeAfter(int item, int data)   
	   {
		   // Implement me.
		   //check to make sure it exists first
		   if (this != null) {
			   link = new IntNode (item, data, link);			//create a new node, connect it to link
		   }
		   
	   }
	   
	   
	   // Precondition: This instance of the IntNode class exists.
	   // In other words, the object whose method is activated exists as a node in the linked list. 
	   // Postcondition: The specific node, which comes immediately after the node whose method is activated, 
	   // is removed from the linked list.
	   public void removeNodeAfter( )   
	   {
		   // Implement me. 
		   //check to make sure it exists first		   	
		   if (this != null) { 
			   if (link != null) {	
				   //Check to see if it is the tail, if not, you can go to the next node
				   if (link.getLink() != null) {
					   link = link.getLink();
				   }
				   
				   //if it is the tail, set the link to null to disconnect the node after
				   else {
					   link = null;
				   }
			   }
		   }

	   } 
	   
	   
	   // Precondition: This instance of the IntNode class exists.
	   // Postcondition: The sequenceNumber of this node is returned.
	   public int getsequenceNumber( )   
	   {
		    // Implement me.
		   if (this != null) {
			   return sequenceNumber;
		   }
		   
		   else return 0;
	   }
	   
	  
	   // Precondition: This instance of the IntNode class exists.
	   // Postcondition: The link of this node is returned.
	   public IntNode getLink( )
	   {
		    // Implement me.  
		   if (this != null) {
			   return link;
		   }
		   return null;
	   } 
	    
	   
	   // Precondition: The linked list contains at least one element.
	   // Postcondition: The (sequence number, data) pairs of each node in the linked list, starting with the head,
	   // are displayed on the monitor. 
	   public void displayNodeData(IntNode head)
	   {
		    // Implement me.
		   if (head != null) {
			   System.out.print("The (sequence nuber, data) pairs in the linked list are: ");
			   
			   IntNode current = head;
			   
			   while (current != null) {
				   System.out.print("(" + current.sequenceNumber + ", " + current.data + ")");
				   
				   current = current.getLink();
			   }	
			   
			   System.out.print("\n \n");
		   }
		   
	   }
	   
	   
	   // Precondition: The head of the linked list is different than null, and its sequenceNumber is different than target.
	   // Postcondition: The link to the specific node, which comes before the node whose sequenceNumber is equal to target, 
	   // is returned. If the linked list does not contain a node with sequenceNumber equal to target, then null is returned.   
	   public IntNode findPrevious(IntNode head, int target)
	   {
		    // Implement me.
		   //keep track of the previous node and current node with variables and move current up the linked list
		   IntNode current = head;
		   
		   //check to see if the head of the linked list is null
		   if (current.getLink() == null) {
			   return null;
		   }
		   
		   //while the sequence number is different from the target, go through the linked list
		   //break out if you reach the end, or if the sequence number equals the target number
		   //it will check the sequence number of the link from current, so current would be the previous node
		   while(current.getLink().getsequenceNumber() != target) {
			   current = current.getLink();
			   if (current.getLink() == null) {
				   break;
			   }
		   }
		   return current;
	   }

	   
	   // Precondition: The head of the linked list is different than null, and its sequenceNumber is smaller than target.
	   // Postcondition: The link to the specific node, which comes before the node that is the first in the linked list 
	   // to have a sequenceNumber greater than target, is returned. 
	   // If no such node is found, the link to the last node in the linked list is returned. 
	   public IntNode locatePredecessor(IntNode head, int target)
	   {
		    // Implement me.
		   //similar to find previous
		   IntNode current = head;
		   
		   //check to make sure head isn't null
		   if (current != null) {
			   //we need to account for is the head is the only node, if so just return it
			   if (current.getLink() == null) {
				   return current;
			   }
			   
			   //now, check to see when the node is greater than the target, then return the one before it
			   //again, current.getLink().sequenceNumber() will actually be the one ahead, so current is the previous
			   //move current through the linked list
			   while (current.getLink().getsequenceNumber() <= target) {
				   current = current.getLink();
				   if (current.getLink() == null) {
					   break;
				   }
			   }
			   return current;
		   }
		   
		   return null;
	   }
	  
}
