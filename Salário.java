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
