class Bank_Account{
	String Account_Holder_Name, Account_type;
	int Account_Number, balance,fbalance,MONEY,MONEY2,deposit=0,withdraw=0,ibalance;
	Bank_Account(String name, int num, String type, int bal){
		Account_Holder_Name = name;
		Account_Number = num;
		Account_type = type;
		balance = bal;
	}
	void deposit_money(int MONEY){
	deposit=MONEY;
	fbalance=balance+deposit;
	}
	void withdraw_money(int MONEY2){
	withdraw=MONEY2;
	fbalance=balance-withdraw;
	}

	void display(){
		System.out.println("USER:"+"\nAccount_Holder_Name: " + Account_Holder_Name + "\nAccount_type: " + Account_type + "\nAccount_Number:" + Account_Number + "\nInitial balance: " + balance  + "\nDeposit:" + deposit + "\nWithdraw:" + withdraw +"\nCurrent balance: " + fbalance );
	}
}
class bank{
	public static void main(String args[]){
		Bank_Account customer1 = new Bank_Account("Imon",60,"S",45000);
		Bank_Account customer2 = new Bank_Account("Sarnojit",51,"C",555000);
		customer1.deposit_money(5000);
		customer1.display();
		customer2.display();
		}
	
}
