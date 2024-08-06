class Box
{
	double h,w,d;
	void setData(double height,double width,double depth)
        {
		h=height;
		w=width;
		d=depth;
	}
	double volume()
        {
		return (h*w*d);
	}
}
class Demo
{
	public static void main(String args[])
        {
		Box ob1 = new Box();
		Box ob2 = new Box();
		ob1.setData(5,6,7);
		ob2.setData(1,2,4);	
		if(ob1.volume()>ob2.volume())
			System.out.println("Box 1 is bigger");
		else
			System.out.println("Box 2 is bigger");
        }
}
