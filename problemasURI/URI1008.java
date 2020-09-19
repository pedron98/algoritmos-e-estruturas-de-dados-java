public class URI1008{
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int number, horas;
		float valorHora, salario;

		number    = teclado.nextInt();
		horas     = teclado.nextInt();
		valorHora = teclado.nextFloat();

		salario = horas*valorHora;

		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f\n", salario);
	}
}
