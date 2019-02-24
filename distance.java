import java.util.*;
class distance
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter x1");
		double x1=s.nextInt();
		System.out.println("enter y1");
		double y1=s.nextInt();
		System.out.println("enter x2");
		double x2=s.nextInt();
		System.out.println("enter y2");
		double y2=s.nextInt();
		System.out.println("enter x3");
		double x3=s.nextInt();
		System.out.println("enter y3");
		double y3=s.nextInt();
		double a=Math.sqrt(((x2*x2)-(x1*x1))+(((y2*y2)-(y1*y1))));
	    double b=Math.sqrt(((x3*x3)-(x2*x2))+(((y3*y3)-(y2*y2))));
	    System.out.println(a+b);
	
	}
}