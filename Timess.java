package Exercicios14ao43;
	import java.util.*;
	
	public class Timess {
		public static void main (String []args) {
			int golsTime1 = 0;
			int golsTime2 = 0;
			char time01, time02;
			
			Scanner sc = new Scanner (System.in);
					
			System.out.println("Digite o nome do primeiro time:");
			time01 = sc.next().charAt(0);
			
			System.out.println("Digite o total de gols do primeiro time:");
			golsTime1 = sc.nextInt();
			
			System.out.println("Digite o nome do segundo time:");
			time02 = sc.next().charAt(0);
			
			System.out.println("Digite o total de gols do segundo time:");
			golsTime2 = sc.nextInt();
			
			if (golsTime1 > golsTime2) {
				System.out.println("O time ganhador foi: " + time01);
				
			}else if (golsTime1 < golsTime2) {
				System.out.println("O time ganhador foi: " + time02);
				
			}else {
				System.out.println("empate!");
				
			}
			
			
			    
		}
	
	}
