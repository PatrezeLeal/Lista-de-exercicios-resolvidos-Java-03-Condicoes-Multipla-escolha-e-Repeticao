package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_14 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*14. Escreva um programa que gere os n�meros de 1000 a 1999, designando se s�o ou n�o divis�veis por 11
 * e se o m�dulo (resto) da divis�o por 11 � ou n�o 5.
 * A sa�da do programa deve seguir o seguinte exemplo:
 * Ex:
 * 1000 n�o � divis�vel por 11 e o m�dulo da divis�o n�o � 5.
 * 1001 � divis�vel por 11 e o m�dulo da divis�o n�o � 5.
 * 1017 n�o � divis�vel por 11 e o m�dulo da divis�o � 5.*/

	
	for ( int numero = 1000; numero <= 1999; numero++)
	{
		
		if (numero %11 == 0) System.out.println(numero + " � divis�vel por 11 e o m�dulo da divis�o n�o � 5.");
		else if (numero %11 == 5) System.out.println(numero + " n�o � divis�vel por 11 e o m�dulo da divis�o � 5.");
		else System.out.println(numero + " n�o � divis�vel por 11 e o m�dulo da divis�o n�o � 5.");
			
	}

		
teclado.close();		
		
	}

}
