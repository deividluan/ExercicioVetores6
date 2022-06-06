package ExercicioTeste;
import java.util.Scanner;

public class ExercicioVetores5 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[11];
		int atual = 0;
		
		for (int cont = 0; cont < 10; cont++) {
			
			System.out.print("Digite um numero: ");
				atual = sc.nextInt();
				
			if (atual > 0) {
				numeros[cont] = atual;
			}
			else {
				numeros[cont] = 0;
			}
		}
		for (int escreve:numeros) {
			System.out.print(escreve + ", ");
		}
	}
}