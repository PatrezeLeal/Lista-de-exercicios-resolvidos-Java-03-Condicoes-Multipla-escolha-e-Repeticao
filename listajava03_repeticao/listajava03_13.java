package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_13 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*13. Desenvolver um programa que efetue a soma de todos os n�meros �mpares que s�o m�ltiplos de tr�s
 * e que se encontram no conjunto dos n�meros de 1 a 100.*/

	int soma = 0;
	
	for ( int numero = 1; numero <= 100; numero++)
	{
		
		if  (numero %2 != 0)
		{
			
			if (numero %3 == 0)
			{
				
				soma = soma + numero;
				
			}
			
		}
		
	}


System.out.println("A soma dos n�meros �mpares e m�ltiplos de 3 de 1 a 100 �: " + soma);
			
teclado.close();		
		
	}

}
