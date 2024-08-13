class Test{
int a;
Test(int i){
a=i;
}
Test incbytes(){
Test temp=new Test(a+10);
return temp;
}
}
class abc{
public static void main(String args[]){
Test ob= new Test(2);
System.out.println(ob.a);
Test ob1= ob.incbytes();
System.out.println(ob1.a);
Test ob2= ob1.incbytes();
System.out.println(ob2.a);
}
}