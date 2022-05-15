package Exercicios14ao43;
	import java.util.*;
	
	public class ValorMaior {
		public static void main(String []args) { 
			int b = 0;
			int y = 0;
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite um número:");
			b = sc.nextInt();
			
			System.out.println("Digite outro número:");
			y = sc.nextInt();
			
			if (b>y) {
				System.out.println("O número maior é: " + b);
			} else {
				System.out.println("O número maior é: " + y);
			}
		}
		
	
	}
