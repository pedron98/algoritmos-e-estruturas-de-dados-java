public class URI1002{
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		double area, raio;
		double n = 3.14159;

		raio = teclado.nextDouble();

		area = n*(raio*raio);

		System.out.printf("A=%.4f\n", area);
	}
}
