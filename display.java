abstract class TwoDShape{
	double dim1;
	double dim2;
	TwoDShape(double dim1,double dim2){
	this.dim1 = dim1;
	this.dim2 = dim2;
	}
	abstract void area();
}
class Rectangle extends TwoDShape{
	Rectangle(double l, double b){
		super(l,b);
	}
	void area(){
	double area = dim1*dim2;
	System.out.println("Area of Recatangle = " + area );
	}
}
class display{
	public static void main(String args[]){
		Rectangle ob1 =	new Rectangle(10,12);
		Rectangle ob2 =	new Rectangle(5,6);
		ob1.area();
		ob2.area();
	}
}