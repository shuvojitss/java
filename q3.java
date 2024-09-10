class Room{
double length, breadth;
Room(double l, double b){
length=l;
breadth=b;
}
void calc_area(){
double area=length*breadth;
System.out.println("Area = " + area);
}
}
class bedroom extends Room{
int bathroom,studytable,nightlamp;
bedroom(double x,double y, int p,int q, int r){
super(x,y);
bathroom=p;
studytable=q;
nightlamp=r;
System.out.println("BEDROOM ROOM");
}
void display(){
System.out.println("Bathroom = " + bathroom);
System.out.println("Studytable = " + studytable);
System.out.println("Nightlamp = " + nightlamp);
}
}
class drawingroom extends Room{
int sofa, wallcabinet;
drawingroom(double x,double y,int i, int j){
super(x,y);
sofa=i;
wallcabinet=j;
System.out.println("DRAWING ROOM");
}
void display(){
System.out.println("Sofa = "+ sofa);
System.out.println("Wall Cabinet = " + wallcabinet);
}
}
class q3{
public static void main(String args[]){
bedroom ob1 = new bedroom(10,20,2,7,9);
ob1.calc_area();
ob1.display();
drawingroom ob2 = new drawingroom(30,40,4,1);
ob2.calc_area();
ob2.display();
}
}
/*
BEDROOM ROOM
Area = 200.0
Bathroom = 2
Studytable = 7
Nightlamp = 9
DRAWING ROOM
Area = 1200.0
Sofa = 4
Wall Cabinet = 1
*/
