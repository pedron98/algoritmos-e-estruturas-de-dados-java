public class URI1005{
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		double A, B, media;
		int somaDosPesos = 11;

		A = teclado.nextDouble();
		B = teclado.nextDouble();

		media = (A*3.5 + B*7.5) / somaDosPesos;

		System.out.printf("MEDIA = %.5f\n", media);
	}
}
