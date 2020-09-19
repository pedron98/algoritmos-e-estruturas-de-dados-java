public class URI1073 {
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int n;
		n = teclado.nextInt();

		for(int i = 2; i <= n; i+=2){
			if(i % 2 == 0){
				System.out.println(i+"^2 = " + i*i);
			}
		}
	}
}
