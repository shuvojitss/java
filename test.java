interface A{
	void m1();
	void m2();
}
class xyz implements A{
	public void m1(){
		System.out.println("m1 called");
	}
	public void m2(){
	System.out.println("m2 called");
	}
}
class test{
	public static void main(String args[]){
		xyz ob = new xyz();
		ob.m1();
		ob.m2();
	}
}