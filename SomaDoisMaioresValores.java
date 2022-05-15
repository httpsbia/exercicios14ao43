package Exercicios14ao43;
	import java.util.*;
	
	public class SomaDoisMaioresValores {
		public static void main (String [] args) {
			int v1 = 0;
			int v2 = 0;
			int v3 = 0;
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite um valor: ");
			v1 = sc.nextInt();
			
			System.out.println("Digite um segundo valor: ");
			v2 = sc.nextInt();
			
			System.out.println("Digite um terceiro valor: ");
			v3 = sc.nextInt();
			
			if (v3 < v1 && (v1 < v2)) {
				System.out.println("Os dois maiores valores são: " + v1 + " e " + v2);
				System.out.println("A soma deles é: " + (v1 + v2));
				
			}else if (v2 < v1 && (v1 < v3)) {
				System.out.println("Os dois maiores valores são: " + v1 + " e " + v3);
				System.out.println("A soma deles é: " + (v1 + v3));
				 
			}
			 if (v2 < v1 && (v1 < v3)) {
				 System.out.println("Os dois maiores valores são: " + v1 + " e " + v3);
				 System.out.println("A soma deles é: " + (v1 + v3));
				 
			 }else {
				 System.out.println("Os dois maiores valores são: " + v2 + " e " + v3);
				 System.out.println("A soma deles é: " + (v2 + v3));
			 }
				
			}
		}
	
	
