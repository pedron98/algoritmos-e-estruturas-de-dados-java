public class URI1180 {
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int X[], N;		
		int menor, posMenor;

		N = teclado.nextInt();
		X = new int[N];

		for(int i = 0; i < X.length; i++){
			X[i] = teclado.nextInt();
		}
		
		menor = X[0]; // tenho um valor de referência
		posMenor = 0;

		for(int i = 0; i < X.length; i++){
			if (X[i] < menor){
				menor = X[i];
				posMenor = i;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+posMenor);
	}
}
