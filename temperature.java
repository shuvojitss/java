import java.util.*;
class temperature{
	public static void main(String args[])
	{
	Double f= Double.parseDouble(args[0]);
	double c=(f-32)/9*5;
	System.out.println("Tempertaure in celcius  " + c);
}
}
