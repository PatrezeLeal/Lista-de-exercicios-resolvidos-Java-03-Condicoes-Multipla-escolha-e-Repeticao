package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_11 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*11. Imprimir os n�meros 11, 21, 31,..., 101.*/

int numero = 11;

while (numero <= 101)
{
	System.out.println(numero);
	numero = numero + 10;
}

			
teclado.close();		
		
	}

}
