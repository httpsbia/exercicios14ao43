//Ler um valor e escrever se é positivo, negativo ou zero

package Exercicios14ao43;
	import java.util.*;
	
	public class PositivoNegativoOuZero {
		public static void main (String[] args) {
			int a = 0;
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite um número:");
			a = sc.nextInt();
			
			if (a < 0) {
				System.out.println("Negativo");
				
			}else {
				if (a > 0) {
					System.out.println("Positivo");
					
				}else {
					System.out.println("Igual a zero");
				}
			}
		}
	
	}
