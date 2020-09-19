public class QuadradoMistico {
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int n = teclado.nextInt();

		int e[][] = new int[n][n];

		for(int l=0; l<n; l++){
			for(int c=0; c<n; c++){
				e[l][c] = teclado.nextInt();
			}
		}

		// preciso pegar uma linha para ter a somatoria
		int somaRef = 0;
		for(int c=0; c<n;c++){
			somaRef += e[0][c];
		}

		boolean qm = true;

		for(int l=1; l<n && qm == true; l++){
			int somaLinha = 0;
			for(int c=0; c<n; c++){
				somaLinha += e[l][c];
			}
			if (somaLinha != somaRef){
				qm = false;
			}
		}

		for(int c=0; c<n && qm == true; c++){
			int somaColuna = 0;
			for(int l=0; l<n; l++){
				somaColuna += e[l][c];
			}
			if(somaColuna != somaRef){
				qm = false;
			}
		}

		if(qm){
			System.out.println("SIM");
		}
		else{
			System.out.println("NAO");
		}

	}
}
