public class Account1{


		private String accountName;
		private double balance;
		private String lastName;

	public Account1(String name,double bal,String lastName){
		accountName = name;
		balance = bal;
		lastName = lastName;
	}
	public Account1(){
		

	}
	public Account1(String name, double bal){
		this.accountName = name;
		this.balance = bal;
		
	}
	public Account1( double bal,String lastName){
		this.lastName = lastName;
		this.balance = bal;
	}
	public Account1(double bal){
		this.balance = bal;

	}
	public Account1(String name){
		this.accountName = name;
	}
	public Account1(String name, String lastName){
		this.accountName = name;
		this.lastName = lastName; 
	}
	public void setaccountName(String accountName){
		this.accountName = accountName;
	}
	public void setbalance(double balance){
		this.balance = balance;
	}
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	public String getaccountName(){
		return accountName;
	}
	public double getbalance(){
		return balance;
	}
	public String getlastName(){
		return lastName;
	}
	
}