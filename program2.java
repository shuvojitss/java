import java.util.Scanner;
class program2{
	public static void main(String args[]){
		int i,id;
		Scanner sc = new Scanner(System.in);
		int[] a= new int[5];
		try{
			System.out.println("Enter 5 integers:");
			for(i=0;i<a.length;i++){
				a[i]=sc.nextInt();
				}
			System.out.println("Enter an index to access:");
			id = sc.nextInt();
			System.out.println("Element at index" + id + ":" + a[id]);
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out of Bound");
		}
	}
}