package datastructures;
import java.util.*;
class Node
{
	int data;
	Node next;
	}

public class linklist {
	Node head;
public void insertion(int data)
{
	Node n=new Node();
	n.data=data;
	if(head==null)
	{
		head=n;
	}
	else
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
	temp.next=n;
	}
}
void display()
{
	Node temp=head;
    while(temp!=null)
    {
    	System.out.println(temp.data+" ");
    temp=temp.next;
    }

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         linklist in=new linklist();
         int n=s.nextInt();
         for(int i=0;i<n;i++)
         {
        	 int a=s.nextInt();
        	  in.insertion(a);
         }
	   in.display();
	}

}
