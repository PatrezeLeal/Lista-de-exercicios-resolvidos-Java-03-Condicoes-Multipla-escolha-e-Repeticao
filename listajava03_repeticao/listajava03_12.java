package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_12 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*12. Exibir a soma dos n�meros compreendidos de 1 a 5.*/

int soma = 0;
int numero = 1;

while (numero <= 5)
{
	soma = soma + numero;
	numero++;
}

System.out.println(soma);
			
teclado.close();		
		
	}

}
