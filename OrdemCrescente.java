//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

package Exercicios14ao43;
	import java.util.*;
	
	public class OrdemCrescente {
		public static void main(String []args) {
			int a = 0;
			int b = 0;
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite um número:");
			a = sc.nextInt();
			
			System.out.println("Digite outro número:");
			b = sc.nextInt();
			
			if (a>b) {
				System.out.println("A ordem crescente desses valores é: " + b + "," + a);
			}else {
				System.out.println("A ordem crescente desses valores é: " + a + "," + b);
				
			}
			
		}
	
	}
