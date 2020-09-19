public class URI2167 {
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int N, R[];

		N = teclado.nextInt();
		R = new int[N];

		int posQueda = 0;		

		for(int i = 0; i < R.length; i++){
			R[i] = teclado.nextInt();
		}

		for(int i = 1; i < R.length; i++){
			if(R[i] < R[i-1]){
				posQueda = i+1;
				break;
			}
		}
		System.out.println(posQueda);			
	}
}
