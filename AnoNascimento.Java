package Exercicios14ao43:
import java.util.*;
public class AnoNascimento {
	public static void main(String []args) {
		
		int anoAtual;
		int anoNascimento;
		int resultado;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		
		System.out.println("Digite o ano em que você nasceu:"); 
		anoNascimento = sc.nextInt();
		
		resultado = anoAtual - anoNascimento;
		
		if (resultado >= 16 ) {
			System.out.println("Você poderá votar esse ano!");
			
		}else {
			System.out.println("Você não poderá votar esse ano.");
			
		}
		}

}
