package Exercicios14ao43;
	import java.util.*;
	
	public class QuantidadeMedia {
		public static void main(String [] args) {
			double quantAtualEstoque, quantMaxima, quantMinima, quantMedia;
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite a quantidade atual em estoque: ");
			quantAtualEstoque = sc.nextDouble();
			
			System.out.println("Digite a quantidade máxima em estoque: ");
			quantMaxima = sc.nextDouble();
			
			System.out.println("Digite a quantidade mínima em estoque: ");
			quantMinima = sc.nextDouble();
			
			quantMedia = (quantMaxima + quantMinima)/2;
			
			if (quantAtualEstoque >= quantMedia) {
				System.out.println("Não efetuar compra.");
			} else {
				System.out.println("Efetuar compra");
			}
		}
	
	}
