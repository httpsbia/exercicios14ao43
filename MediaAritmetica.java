//Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada. //

package Exercicios14ao43;
	    import java.util.*;
	
	    public class MediaAritmetica {
		    public static void main (String[] args) {
			float nota1, nota2, resultado;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			nota2 = sc.nextFloat();
			
			resultado = (nota1 + nota2) /2;
			
			if (resultado >= 6) {
				System.out.println("Sua média é de: " + resultado);
				System.out.println("Parabéns! Você foi aprovado (a)!!");
				
			}else {
				System.out.println("Sua média é de: " + resultado);
				System.out.println("Infelizmente você foi reprovado (a)");
				
			}
			
			
		}
	
	}
