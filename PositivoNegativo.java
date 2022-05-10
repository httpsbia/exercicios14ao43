package Exercícios14_ao_43;
import java.util.*;

public class PositivoNegativo {
	public static void main(String[] args) {
	int x = 0;
	int y = 0;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um número: ");
	x = sc.nextInt();
	
	System.out.println("Digite outro número: ");
	y = sc.nextInt(); 
	
	
	if (x>y) {
		System.out.println("o número " + x + " é maior que " + y);
	}else {
		System.out.println("o número " + y + " é menor que " + x); 
		
	}
	
	
	
	}
	
	 

}
