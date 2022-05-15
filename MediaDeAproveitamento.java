//Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
//exercícios que fazem parte da avaliação.

package Exercicios14ao43;
	import java.util.*;
	
	public class MediaDeAproveitamento {
		public static void main (String []args) {
			double nota1, nota2, nota3, mediaAproveitamento, mediaExercicios;
			char conceito;
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			nota2 = sc.nextDouble();
			
			System.out.println("Digite a teceira nota: ");
			nota3 = sc.nextDouble();
			
			System.out.println("Digite a media dos exercicios: ");
			mediaExercicios = sc.nextDouble();
			
			mediaAproveitamento = nota1 + nota2 + nota3 + mediaExercicios / 7;
			
			if (mediaAproveitamento >=  9.0) {
		        conceito = 'A';
				
			}else if (mediaAproveitamento >= 7.5 && (mediaAproveitamento < 9.0)) {
				conceito = 'B';
				
			}else if (mediaAproveitamento >= 6.0 &&(mediaAproveitamento < 7.5)) {
				conceito = 'C';
				
			}else {
				conceito = 'D';
			}
			    
				System.out.println(conceito);
		}
	
	}
