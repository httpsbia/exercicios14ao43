//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
//das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
//novo com a mulher mais velha. 

package Exercicios14ao43;
    import java.util.*;

    public class HomemMulher {
        public static void main(String[] args) {
		int mulher1, mulher2, homem1, homem2, soma, mult;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade da primeira mulher: ");
        mulher1 = sc.nextInt();

		System.out.println("Digite a idade da segunda mulher: ");
		mulher2 = sc.nextInt();

		System.out.println("Digite a idade do primeiro homem: ");
        homem1 = sc.nextInt();

		System.out.println("Digite a idade do segundo homem: ");
		homem2 = sc.nextInt();

		if (homem1 > homem2 && (mulher1 > mulher2)) {

		soma = homem1 + mulher2;

		mult = homem2 * mulher1;

		}else if (homem1 > homem2 && (mulher2>mulher1)) {

		soma = homem1 + mulher1;

		mult = homem2 * mulher2;

		}else if (homem2 > homem1 && (mulher1>mulher2)){

		soma = homem2 + mulher2;

		mult = homem1 * mulher1;

		}else{

		soma = homem2 + mulher1;

		mult = homem1 * mulher2;

		}

		System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println( "O produto do homem mais novo com a mulher mais velha é: " +mult);
		}

		



	}


