public class URI1007{
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int A, B, C, D, diferenca;

		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();

		diferenca = A*B-C*D;

		System.out.println("DIFERENCA = "+diferenca);
	}	
}