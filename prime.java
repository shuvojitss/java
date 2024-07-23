class prime{
public static void main(String args[]){
	int i,b=1,n=71;
	for(i=2;i<n;i++){
	if(n%i==0){
	b=0;
	break;}
	}
	if(b==0){
	System.out.println("composite no.");}
	else{
	System.out.println("Prime no.");}
}
}

	