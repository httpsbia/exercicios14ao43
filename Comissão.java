package Exercicios14ao43;
import java.util.*;

public class Comissao {
    public static void main (String [] args) {
	double valorComissao, salarioFixo, vendasEfetuadas, salarioTotal;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o salário fixo: ");
    salarioFixo = sc.nextDouble();
    
    System.out.println("Digite o valor de vendas efetuadas: ");
    vendasEfetuadas = sc.nextDouble();
    
    if (vendasEfetuadas <= 1500) {
    	
    	valorComissao = (vendasEfetuadas * 3) /100;
    	salarioTotal = valorComissao + salarioFixo;
    	
    	System.out.println("O valor da comissão é de: " + valorComissao);
    	System.out.println("O salário total será de: " + salarioTotal);
    	
    }else {
    	valorComissao = (vendasEfetuadas * 5) /100;
    	salarioTotal = valorComissao + salarioFixo;
    	
    	System.out.println("O valor da comissão é de: " + valorComissao);
    	System.out.println("O salário total será de: " + salarioTotal);
    }
    
	
	
}

}
