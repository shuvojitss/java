interface A{
	void m1();
	void m2();
}
class xyz implements A{
	public void m1(){
		System.out.println("m1 called");
	}
}	
class test_run{
	public static void main(String args[]){
		xyz ob = new xyz();
	}
}