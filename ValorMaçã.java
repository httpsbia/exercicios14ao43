package Exercicios14ao43;
	import java.util.*;
	
	public class ValorMaçã {
		public static void main (String[] args) {
			double precoMaca, quantMaca;
			Scanner sc  = new Scanner (System.in);
			
					System.out.println("Digite a quantidade de maças: ");
					quantMaca = sc.nextDouble();
					
					System.out.println("A quantidade de maças compradas foi: " + quantMaca);
					
					if (quantMaca >= 12) {
						precoMaca = 1.00;
						System.out.println("O preço a pagar pelas maças é de: " + precoMaca);
						System.out.println("O total a pagar é: " + (1.00*quantMaca));
					}else {
						precoMaca = 1.30;
						System.out.println("O preço a pagar pelas maças é de: " + precoMaca);
						System.out.println("O total a pagar é: " + (1.30*quantMaca));
						
					}
		}
	}
