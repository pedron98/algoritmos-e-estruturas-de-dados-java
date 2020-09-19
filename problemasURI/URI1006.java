public class URI1006{
	public static void main(String agrs[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		double A, B, C, media;
		int somaDosPesos = 10;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		media = (A*2 + B*3 + C*5) / somaDosPesos;

		System.out.printf("MEDIA = %.1f\n", media);
	}
}
