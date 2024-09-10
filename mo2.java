class A{
int i;
A(int x){
i=x;
}
void show(){
System.out.println(i);
}
}
class B extends A{
int j;
int i;
B(int x,int y, int z){
super(x);
j=y;
i=z;
}
void show(){
System.out.println(j);
System.out.println(i);
System.out.println(super.i);
}
}
class mo2{
public static void main(String args[]){
A ob1 = new A(4);
ob1.show();
B ob =new B(1,2,3);
ob.show();
}
}

