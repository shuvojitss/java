class AREA{
double area(double a){
	return 3.14*a*a;
	}
int area(int a){
	return a*a;
}
int area(int a, int b){
	return a*b;
}
}
class calculate{
	public static void main(String args[]){
	AREA circle = new AREA();
	AREA square = new AREA();
	AREA rectangle = new AREA();
	System.out.println("Area of circle:"+ circle.area(5.7));
	System.out.println("Area of square:"+ square.area(5));
	System.out.println("Area of rectangle:"+ rectangle.area(7,8));
}
}


	