package Banco;

public class Conta {

	private int number;
	private String holder;
	private double balance;
	
	
	public Conta(int number, String holder) {
		
		this.number = number;
		this.holder = holder;
	}


	public Conta(int number, String holder, double initialDeposit) {
		
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //metodo de deposito
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalace() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public void witdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta " 
				+ number
				+ ", Usu�rio: "
				+ holder
				+ ", Saldo: $ "
				+ String.format("%.2f", balance);
	}
	
}















