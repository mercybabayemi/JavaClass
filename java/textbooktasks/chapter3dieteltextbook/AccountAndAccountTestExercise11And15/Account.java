package chapter3dieteltextbook.AccountAndAccountTestExercise11And15;

public class Account{
	private String name;
	private double balance;
	
	public Account(String name, double balance){
		this.name = name;

		if(balance > 0.0){
			this.balance = balance;
		}
	}

	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			balance = balance + depositAmount;
		}
	}

	public double getBalance(){
		return balance;
	}

	public void setName(String Name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	
	public void withdrawMoney(double withdrawalAmount){
		if(withdrawalAmount < balance){
			balance = balance - withdrawalAmount;
		}
		else{
			System.out.println("Withdrawal amount exceeded account balance");
		}
	}
}