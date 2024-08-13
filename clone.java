class Box{
double l,b;
Box(double l,double b){
	this.l=l;
	this.b=b;
}
Box(Box o){
	this.l=o.l;
	this.b=o.b;
}
}
class clone{
public static void main(String args[]){
Box ob1=new Box(2,3);
Box ob2=new Box(ob1);
System.out.println(ob1.l*ob1.b);
System.out.println(ob2.l*ob2.b);
}
}