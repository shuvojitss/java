class Box
{
	double h,w,d;
	Box(double height,double width,double depth)
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
class Demox
{
	public static void main(String args[])
        {
		Box ob1 = new Box(5,6,7);
		Box ob2 = new Box(1,2,4);
		if(ob1.volume()>ob2.volume())
			System.out.println("Box 1 is bigger");
		else
			System.out.println("Box 2 is bigger");
        }
}
