class box
{
   double h, w, d;
   box()
  {
     h=1;
     w=1;
     d=1;
  }
  box(int len)
   {
      h=w=d=len;
   }
  box(double h1, double w1, double d1)
 {
   h=h1;
   w=w1; 
   d=d1;
 }
void volume()
{
   System.out.println(h*w*d);
}
}
class volbox
{
  public static void main(String[] args){
   box obj1=new box();
   box obj2=new box(6);
   box obj3=new box(1,2,5);
   obj1.volume();
   obj2.volume();
   obj3.volume();
}
}