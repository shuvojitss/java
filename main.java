interface A{
	void method();
}
interface B{
	void method();
}
class abc implements A,B{
	public void method(){
		System.out.println("Using interface for multiple inheritance");
	}
}
class main{
	public static void main(String args[]){
		abc ob = new abc();
		ob.method();
	}
}

/*Using interface for multiple inheritance*/
