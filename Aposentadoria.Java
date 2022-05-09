package Exercicios14ao43;
import java.util.*;

public class Aposentadoria {
  public static void main (String []args) {
	int codigo, anoNascimento, anoIngresso, idade, tempoTrabalho;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite o código do empregado: ");
	codigo = sc.nextInt();
	
	System.out.println("Digite o ano de nascimento do empregado: ");
	anoNascimento = sc.nextInt();
	
	System.out.println("Digite o ano de ingresso do empregado na empresa: ");
	anoIngresso = sc.nextInt();
	
	idade = 2022 - anoNascimento;
	
	tempoTrabalho = 2022 - anoIngresso;
	
	System.out.println("O empregado " + codigo + " possui " + idade + " anos de idade,");
	System.out.println("e trabalhou " + tempoTrabalho + " anos.");
	
	if (idade>=60 && (tempoTrabalho>=25)) {
	System.out.println("Requer aposentadoria");
	
    }else {
    	System.out.println("Não requer aposentadoria");
    }

	
}
}
