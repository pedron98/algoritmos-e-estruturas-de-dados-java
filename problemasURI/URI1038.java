public class URI1038 {
	public static void main(String args[]){
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		int codigo, quantidade;
		float total = 0;

		codigo = teclado.nextInt();
		quantidade = teclado.nextInt();
		
		switch(codigo){
			case 1:
				total = quantidade * 4.0f;
				break;
			case 2:
				total = quantidade * 4.50f;
				break;
			case 3:
				total = quantidade * 5.0f;
				break;
			case 4:
				total = quantidade * 2.0f;
				break;
			case 5:
				total = quantidade * 1.50f;
				break;
		}
		System.out.printf("Total: R$ %.2f\n", total);
	}
}
