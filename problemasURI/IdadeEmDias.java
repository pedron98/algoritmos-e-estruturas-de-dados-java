import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String args[]){

		// 400 / 365
		//  35    1

		// 35 / 30
		//  5	 1

		int anosEmDias;
		int qtdAnos;
		int qtdMeses;
		int qtdDias;
		int resto;

		Scanner teclado = new Scanner(System.in);

		anosEmDias = teclado.nextInt();

		qtdAnos = anosEmDias / 365;

		resto = anosEmDias % 365;

		qtdMeses = resto / 30;

		qtdDias = resto % 30;

		System.out.println(qtdAnos + " ano(s)");
		System.out.println(qtdMeses + " mes(es)");
		System.out.println(qtdDias + " dia(s)");

	}
}