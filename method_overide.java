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
B(int x,int y){
super(x);
j=y;
}
void show(){
System.out.println(j);
System.out.println(i);
}
}
class method_overide{
public static void main(String args[]){
B ob =new B(1,2);
ob.show();
}
}

/*2
1*/
