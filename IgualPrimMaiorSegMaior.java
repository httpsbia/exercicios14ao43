//Ler dois valores e escrever se são iguais, se o primeiro é maior ou se o segundo é maior.

package Exercicios14ao43;
    import java.util.*;

    public class IgualPrimMaiorSegMaior {
	    public static void main (String []args) {
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		a = sc.nextInt();
		
		System.out.println("Digite outro número:");
		b = sc.nextInt();
		
		if (a<b) {
	
			System.out.println("O segundo número é o maior");
			
		}else if (a>b) {
			
			System.out.println("O primeiro número é o maior");
			
		}else {
			
			System.out.println("Os números são iguais");
		}
	
	}

}
