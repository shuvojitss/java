class condition{
public static void main(String args[]){
int a=10,b=20,c=30;
if(a<b && a<c){
	System.out.println("smallest="+a);
	if(b<c){
	System.out.println("largest="+c);
	}
	else{
	System.out.println("largest="+b);
	}
}
else if(b<a && b<c){
	System.out.println("smallest="+b);
	if(a<c){
	System.out.println("largest="+c);
	}
	else{
	System.out.println("largest="+a);
	}	
}
else{
	System.out.println("smallest="+c);
	if(a<b){
	System.out.println("largest="+b);
	}
	else{
	System.out.println("largest="+a);
	}

}
}
}

