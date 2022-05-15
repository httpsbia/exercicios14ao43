//Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
//média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra'. 

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
