class A{
void show(){
System.out.println("Inside A");
}
}

class B extends A{
void show(){
System.out.println("Inside B");
}
}
class C extends A{
void show(){
System.out.println("Inside C");
}
}
class Dynamic_method_Dispatch{
public static void main(String args[]){
A ob1 = new A();
B ob2 = new B();
C ob3 = new C();
A ref;
ref=ob1;
ref.show();
ref=ob2;
ref.show();
ref=ob3;
ref.show();
}
}

/*Inside A
Inside B
Inside C*/
