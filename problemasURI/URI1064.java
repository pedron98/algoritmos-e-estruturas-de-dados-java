public class URI1064 {
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		float valor;
		float media = 0f;
		int cont = 0;

		for(int i = 1; i <= 6; i++){
			valor = teclado.nextFloat();
			if(valor >= 0){
				media += valor;
				cont++;
			}
		}
		
		media /= cont;

		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f\n", media);
	}
}
