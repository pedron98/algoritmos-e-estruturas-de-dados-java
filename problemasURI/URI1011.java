import java.util.Scanner;

public class URI1011 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Double raio = 0.0;
		raio = teclado.nextDouble();
		Double volume = (4/3.0) * 3.14159 * (raio*raio*raio);

		System.out.printf("VOLUME = %.3f\n", volume);
	}
}
