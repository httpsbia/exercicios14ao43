package Exercicios14ao43;
	import java.util.*;
	
	public class SaldoAtual {
		public static void main (String []args) {
			double numeroConta, saldo, debito, credito, saldoAtual;
			Scanner sc =  new Scanner (System.in);
			
			System.out.println("Digite o número da sua conta: ");
			numeroConta = sc.nextDouble();
			
			System.out.println("Digite seu saldo: ");
			saldo = sc.nextDouble();
			
			System.out.println("Digite seu débito: ");
			debito = sc.nextDouble();
			
			System.out.println("Digite seu crédito: ");
			credito = sc.nextDouble();
			
			saldoAtual = saldo - debito + credito;
			
			if (saldoAtual >= 0) {
				System.out.println("Seu saldo atual é de: " + saldoAtual);
				System.out.println("Saldo Positivo");
				
			}else {
				System.out.println("Seu saldo atual é de: " + saldoAtual);
				System.out.println("Saldo Negativo");
			}
	    	
	    	
		}
	
	}
