package com.list;

class Node{
 int data;
 Node next;   //this is the reference object that store the memory address
//next ix called the instance object reference of the some class 
 
 Node(int freshdata)
 {
	 this.data=freshdata;
	 this.next=null;
 }
}
 public class Insertion_LinkedList {
	 
	 //function to insert a new node at the beginning of the list
	 
	 public static Node insertAtFront(Node head,int fresh_data)
	 {
		 //create a new node with  the given data
		 Node fresh_node=new Node(fresh_data);
		 
		 //make the next of the new node point to  the current head
		 
		 fresh_node.next=head;
		 
		 //return the new node as the new head of the list
		 
		return fresh_node;
		
		 
	 }
	 
	 //function appends a new node at the end of the 
	 //singly linked list and returns the head node
	 public static Node insertAtEnd(Node head, int fresh_data)
	 {
		 //create a new node
		 Node newNode=new Node(fresh_data);
		 
		 //if the Linked list is empty, make the new node as the head and return
		 
		 if(head==null)
		 {
			 return newNode;
		 }
		 //sorted the head reference in a temporary variable
		 
		 Node last=head;
		 //traverse till the last node
		 while (last.next!=null)
		 {
			 last=last.next;
		 }
		 //change the next pointer of the last node to point to  the new node
		 last.next=newNode;
		 //return the head of the list
		return head;
	 }
	 
	  
		 public static Node insertAtPostion(Node head,int position,int fresh_data)
		 {
			
			 //create a new node  at the memory and allocating and inizilation
			 
			 Node freshNode=new Node(fresh_data);
			 // if inserting at the begining
			 if(position==1)
			 {
				 freshNode.next=head;
				 head=freshNode;
				 return head; 
			 }
			 Node current=head;  //save the head value
			 for(int i=1;i<position-1&&current!=null;++i)
			 {
				 current=current.next; //node at given position
			 }
			 
			 
			 //if the position is out of   bounds
			 if(current==null) {
				 System.out.println("Position out of bounds:");
				 return head;
			 }
			 freshNode.next=current.next;
			 current.next=freshNode;
			 return head;
			 
		 }
		 
		 //checks whether key is present in linked list
		 
		 static boolean searchKey(Node head, int key)
		 {
			 int p=0;
			 //Initialize curr with the head of linked list
			 Node curr=head;
			 
			 //Iterate over all the nodes
			 
			 while(curr!=null)
				 
			 {
				 p++;
				 
				 //if the current node's value is equa; t key,
				 //return true;
				 
				 if(curr.data==key)
				 {
					 System.out.println("Position at : "+p);
					 return true;
				 }
				 //move to the next node
				 
				 curr=curr.next;
			 }
			 
			 //if there is no node with value as key, return
			 //false
			return false;
			 
		 }
		
		 
		 //how  to count the node sin the singly linked list
		 
		 public static int countNodes(Node head)
		 {
			 //Initialize count with 0
			 
			 int count=0;
			 
			 //Initialize curr with head of Linked List
			 
			 Node curr=head;
			 
			 //Traverse till we reach null
			 
			 while(curr!=null)
			 {
				 //Increment count by 1
				 count++;  //while loop executes till curr==null that 
				 //is end of singly linked list.
			   //Move pointer to next node
				 
				 curr=curr.next;
			 }
			 //Return the count of nodes
			 
			 return count;
		 }
	// public class InsertAfterData
	// {
		 //function to insert a new node after a given node
	 
		 public static Node insertAfter(Node head,int key,int newData)
		 {
			 Node curr=head;
			 
			 //Iterate over Linked List to find the key
			 
			 while(curr!=null)
			 {
				 if(curr.data==key)
					 break;
				 curr=curr.next;
			 }
			 //if curr becomes null means, given key is nor found in linked list
			 
			 if(curr==null)
			 
				 return head;
			//Allocate new node by given data and point
			 //the next of freshNode to curr's next & ppoint current next to 
			 //fresh node
			 
			 Node freshNode=new Node(newData);
			 freshNode.next=curr.next;
			 curr.next=freshNode;
			 
			return head;
			 
		 }
	 //}
		 
	 public static void printList(Node head)
	 {
		 {
		 //  iteration OR  traversal means going through one by one
		 Node curr=head;
		 while(curr!=null)
		 {
		System.out.print(""+curr.data);
		 curr=curr.next;
		 }
		 System.out.println();
	 }
	 }
	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//create the LI  key list 2->3->4->5
		
		Node head=new Node(2);
		head.next=new Node(3);
		head.next.next=new Node(4);
		head.next.next.next=new Node(5);
		
		//print the original list
		System.out.println("original linked list:");
		printList(head);
	
	//insert  a new node at the front of the list
System.out.println("After inserting Nodes at the front:");
	int data=100;
	head=insertAtFront(head,data); 
	printList(head);
	
	//insert a new node at the end of the list
	System.out.println("After inserting at the end:");
	int data1=10;
	head=insertAtEnd(head,data1);
	printList(head);
	
	//insert at the middle position
	System.out.println("After inserting at the pos:");

	int data2=9;
	int pos=3;
	head=insertAtPostion(head,pos,data2);
	printList(head);
	
	
	 //key to search in the linked list
	int key=9;
	
	if (searchKey(head,key))
	{
	//this command will execute searchKey method
		System.out.println("whether the given position is found or not  : ");
     System.out.println("Yes");
	}
     else
    	 System.out.println("no");
	
	//Time complexity:O(N), where N is the number of nodes in   the Linked LIst
	//Auxiliary Space:O(1)
	
	
	//key :insert node aftre key
	int  key1=3,freshData=4;
	//insert a new node with data 4 after the node haveing data 3
	head=insertAfter(head,key1,freshData);
	System.out.println("Linked list after insertion: ");
	printList(head);
	
	
	}

	
		
 }