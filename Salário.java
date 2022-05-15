// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas). 

package Exercicios14ao43;
	import java.util.*;
	
	public class Salário {
		public static void main(String[] args ) {
			
			double horasTrabalhadas, salarioHora, salarioTotal, salario, valorHoraExtra, quantHorasExtras, salarioHoraExtra;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite as horas trabalhadas no mês: ");
			horasTrabalhadas = sc.nextDouble();
			
			System.out.println("Digite o salário por hora: ");
			salarioHora = sc.nextDouble();
			
			if (horasTrabalhadas <= 160) {
				salario = horasTrabalhadas * salarioHora;
				valorHoraExtra = 0;
				
				System.out.println("Seu salário será de: R$" + salario);
		    }else {
		    	salario = 160 * salarioHora;
		    	quantHorasExtras = horasTrabalhadas - 160;
		    	valorHoraExtra = salarioHora + (salarioHora * 50) / 100;
		    	salarioHoraExtra = valorHoraExtra * quantHorasExtras;
		    	salarioTotal = salario + salarioHoraExtra;
		    	
		    	
		    	System.out.println("A quantidade de horas extras trabalhadas foram de: " + quantHorasExtras + "horas");
		    	
		    	System.out.println("Seu salário acrescido de horas extras será de: " + salarioTotal );
		    	
		    }
		    
			
			
			
				
			}
	}
