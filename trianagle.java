import java.util.*;
class triangle{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Float a,b,c,s;
	System.out.print("Enter length of 1st side :");
	a=sc.nextFloat();
	System.out.print("Enter length of 2st side :");
	b=sc.nextFloat();
	System.out.print("Enter length of 3st side :");
	c=sc.nextFloat();
	s=(a+b+c)/2;
	Double r=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Perimeter :" + s*2);
	System.out.println("Area :" + r);
	}
}
