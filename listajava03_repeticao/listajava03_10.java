package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_10 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*10. Imprimir os n�meros pares de 2 a 50.*/

	for (int numero = 2; numero <= 50; numero++)
	{
		if (numero %2 == 0) System.out.println(numero);
	}

			
teclado.close();		
		
	}

}
