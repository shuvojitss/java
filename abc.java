class A{
	void method(){
		System.out.println("In A");
	}
}
class B{
	void method(){
		System.out.println("In B");
	}
}
class C extends A,B{
	void method(){
		System.out.println("In C");
	}
}
class abc{
	public static void main(String args[]){
		C ob = new C();
		ob.method();
	}
}

/*
abc.java:11: error: '{' expected
class C extends A,B{
                 ^
1 error
	*/
