package Aplicacao;

import java.util.Locale;
import java.util.Scanner;
import Banco.Conta;


public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Conta account;
		
		System.out.println("Entre com número da conta: ");
		int number = scan.nextInt();
		System.out.println("Entre com o Usuário: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.println("Tem deposito inicial (s/n)?: ");
		char response = scan.next().charAt(0);
		if (response == 's') {
			System.out.println("Entre com o valor do  deposito inicial: ");
			double initialDeposit = scan.nextDouble();
			account = new Conta(number, holder, initialDeposit);
			
		}else {
			account = new Conta(number, holder);
		}
		System.out.println();
		System.out.println("Informações da Conta: ");
		System.out.println(account );
		
		System.out.println();
		System.out.println("Entre com o valor do deposito: ");
		double depositValor = scan.nextDouble();
		account.deposit(depositValor);
		System.out.println("Novo valor da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Entre com do saque do deposito: ");
		double witdrawSaque = scan.nextDouble();
		account.witdraw(witdrawSaque);
		System.out.println("Saldo atualizado da conta: ");
		System.out.println(account);
		
		scan.close();
	}
}
