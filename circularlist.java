import java.util.*;
class circularlist
{ 
static class Node 
{ 
	int data; 
	Node next; 
}; 
static Node push(Node start, 
				int data) 
{ 
	Node n = new Node(); 
	Node temp = start; 
	n.data = data; 
	n.next = start; 
	if (start != null) 
	{ 
		while (temp.next != start) 
			temp = temp.next; 
		temp.next = n; 
	} 
	else
		n.next = n; 

	start = n; 
	
	return start; 
} 

static void printList(Node head) 
{ 
	Node temp = head; 
	if (head != null) 
	{ 
		do
		{ 
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		} 
		while (temp != head); 
	} 
} 
 
public static void main(String args[]) 
{ 

	Scanner s=new Scanner(System.in);
  Node head = null; 
  int x=s.nextInt();
for(int i=0;i<x;i++)
  {
    int a=s.nextInt();
   head= push(head,a);
  } 
System.out.println("Contents of Circular " + 
								"Linked List:"); 
	printList(head); 
} 
} 

