package Exercicios14ao43;
	import java.util.*;
	
	public class TesteDeMesa {
		public static void main (String []args) {
			int x = 0;
			int y = 0;
			int z = 0;
			char resposta;
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite um valor x:");
			x = sc.nextInt();
			
			System.out.println("Digite um valor y:");
			y = sc.nextInt();
			
			z = (x * y) + 5; 
			
			if (z<=0) {
				resposta = 'A';
				
			}else if (z<=100) {
				resposta = 'B'; 
				
			}else {
				resposta = 'C';
			}
			
			System.out.println(z);
			System.out.println(resposta);
			
		}
	
	}
