//Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
//e mostre seu peso ideal, utilizando as seguintes fórmulas:
// - para sexo masculino: peso ideal = (72.7 * altura) - 58
// - para sexo feminino: peso ideal = (62.1 * altura) - 44.7

package Exercícios14_ao_43;
import java.util.*;

public class PesoIdeal01 {
	    public static void main (String []args) {
	    char nome; 
	    char sexo;
	    double pesoIdeal, altura;
	    Scanner sc = new Scanner (System.in);
	
	    System.out.println("Digite seu nome: ");
	    nome = sc.next().charAt(0);

	    System.out.println("Digite seu sexo: (M/F) ");
	    sexo = sc.next().charAt(0);
	    
	    System.out.println("Digite sua altura: ");
	    altura = sc.nextDouble();

	    if ( sexo == 'M' ) {
	    	pesoIdeal = ((altura*72.7) - 58);
	    	
		
	    }else {
	    	pesoIdeal = ((62.1*altura) - 44.7);
		
	} 
	   System.out.println(pesoIdeal);
	}

}
