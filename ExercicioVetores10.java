package ExercicioTeste;

import java.util.Scanner;

public class ExercicioVetores10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float[] notas = new float[11];
		float soma = 0 , media = 0;
		
		for(int freio = notas.length -1; freio > 0; freio-- ) {
			
			System.out.print("Nota do aluno: ");
			notas[freio] = sc.nextFloat();
			
			soma += notas[freio];
			
			if (notas[freio] < 6) {
				System.out.println("Nota Vermelha");
			}
			else {
				System.out.println("Nota Azul");
			}
		}
		
		System.out.print("A média da turma foi: " + (soma/10));
	}

}
