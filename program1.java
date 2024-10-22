import java.util.Scanner;
class program1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter the numerator:");
			int n = sc.nextInt();
			System.out.println("Enter the denominator:");
			int d = sc.nextInt();
			int result = n/d;
			System.out.println("Result:" + result);
			}
		catch(Exception e){
			System.out.println("Exception Caught: Divide by Zero not Possible.");
			}
		}
}
