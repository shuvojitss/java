interface A{
	void m1();
	void m2();
}
abstract class xyz implements A{
	public void m1(){
		System.out.println("m1 inside interface");
	}
}
class bcd extends xyz{
	public void m1(){
		System.out.println("m1 called");
	}
	public void m2(){
	System.out.println("m2 called");
	}
}
class test{
	public static void main(String args[]){
		bcd ob = new bcd();
		ob.m1();
		ob.m2();
	}
}

/*
m1 called
m2 called
*/
