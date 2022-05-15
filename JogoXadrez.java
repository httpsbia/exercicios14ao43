//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 

package Exercícios14_ao_43;
import java.util.*;

public class JogoXadrez {
	    public static void main(String []args) {
		int horaInicio, horaFinal, duracao;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Horário em que o jogo de xadrez iniciou:");
		horaInicio = sc.nextInt();
		
		System.out.println("Horário em que o jogo de xadrez acabou:");
		horaFinal = sc.nextInt();
		
		duracao = horaFinal - horaInicio;
		
		
		
		if (duracao<0) {
        int dia = duracao + 24;
		System.out.println("O jogo teve " + dia + "hora(s) de duração.");
		
		} else {
			System.out.println("O jogo teve " + duracao + " hora(s) de duração.");
		}
		
			
		
	}

}
