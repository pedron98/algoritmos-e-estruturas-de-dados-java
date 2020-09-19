public class URI1178 {
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		double N[];
		N = new double[100];
		
		N[0] = teclado.nextDouble();
		System.out.printf("N[0] = %.4f\n", N[0]); 
		for(int i = 1; i < N.length; i++){
			N[i] = N[i-1] / 2;
			System.out.printf("N[%d] = %.4f\n", i, N[i]);
		}
	}
}
