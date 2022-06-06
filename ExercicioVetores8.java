package ExercicioTeste;

public class ExercicioVetores8 {
	public static void main (String[]args) {
		
		int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 5};
		int numero = 5;
		int cont = 0;
		
		
	
		for (int freio = 0; freio < 12; freio++) {
			if (lista[freio] == numero) {
				cont ++;
				System.out.println("O numero " + numero + " esta na posição: " + freio );
			}
		}	
		
		System.out.print("O numero " + numero + " apareceu " + cont + " vezes");
	}
}