public class URI1010{
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int cod1, cod2, qtde1, qtde2;
		float valor1, valor2, valorFinal;

		cod1   = teclado.nextInt();
		qtde1  = teclado.nextInt();
		valor1 = teclado.nextFloat();

		cod2   = teclado.nextInt();
		qtde2  = teclado.nextInt();
		valor2 = teclado.nextFloat();

		valorFinal = (valor1*qtde1) + (valor2*qtde2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);

	}
}
