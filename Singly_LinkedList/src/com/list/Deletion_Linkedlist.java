package com.list;
class Node1{
	 int data;
	 Node1 next;  
	 //this is the reference object that store the memory address
	//next ix called the instance object reference of the some class 
	 
	 Node1(int freshdata)
	 {
		 this.data=freshdata;
		 this.next=null;
	 }
	}

public class Deletion_Linkedlist {
	//Function to delete a node at a given position
	
	public static Node  deleteNode(Node head,int position)
	{
		Node temp=head;
		Node prev=null;
		
		//Base case of linked list is empty
		if(temp==null)
			return head;
		
		//case1: Head is to be deleted
		
		
		
		//case 2:Node to be deleted is in middle
		//Traverse till given position
		for(int i=1;temp!=null&&i<position;i++)
		{
			prev=temp;
			temp=temp.next;
		}
		
		//If given position is found, delete node 
		if(temp!=null)
		{
			prev.next=temp.next;  //change addres of head to next
			
		}
		else
		{
			System.out.println("Data not present");
		}
		return head;
	}
	
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

	public static void main(String[] args) {
		
		//create the LI  key list 2->3->4->5
		
				Node head=new Node(2);
				head.next=new Node(3);
				head.next.next=new Node(4);
				head.next.next.next=new Node(5);
				
				//print the original list
				System.out.println("original linked list:");
				printList(head);
		
		
		//Deleting node at position at 2
		int position=2;
		head=deleteNode(head,position);
		
		//print list after deletion
		System.out.println("List after deletion: ");
		printList(head);

	}

}
