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
/*
test_run.java:5: error: xyz is not abstract and does not override abstract method m2() in A
class xyz implements A{
^
1 error
	*/
