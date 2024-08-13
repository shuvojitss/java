class test{
int a,b;
test(int i,int j){
a=i;
b=j;
}
Boolean equals(test ob){
if(ob.a == a && ob.b == b)
return true;
else
return false;
}
}
class obpar{
public static void main(String args[]){
test ob1=new test(1,2);
test ob2=new test(1,2);
test ob3=new test(7,8);
System.out.println(ob1.equals(ob2));
System.out.println(ob1.equals(ob3));
}
}