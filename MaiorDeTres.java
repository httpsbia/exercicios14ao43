//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles

package Exercicios14ao43;
    import java.util.*;

    public class MaiorDeTres {
	    public static void main (String[] args) {
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite um segundo valor: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite um terceiro: ");
		n3 = sc.nextInt();
		
	    if (n1 < n2 && (n3 < n2)) {
	    	System.out.println("O maior número é: " + n2);
	    	
	    }else if (n1 < n3 && (n1 < n3)) {
	    	System.out.println("O maior número é: " + n3);
	    	
	    }if (n3 < n1 && (n2 < n1)) {
	    	System.out.println("O maior número é: " + n1);
	    	
	    }
	}

}
