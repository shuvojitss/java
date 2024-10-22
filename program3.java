import java.util.Scanner;
class program3{
	public static void main(String args[]){
		int i;
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter a number:");
			String input = sc.nextLine();
			i = Integer.parseInt(input);
			System.out.print("You entered number:" + i);
			}
		catch(NumberFormatException e){
			System.out.println("Error : Inavlid number format");
		}
	}
}