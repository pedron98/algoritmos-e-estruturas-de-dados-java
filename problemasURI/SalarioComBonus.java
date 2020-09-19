import java.util.Scanner;

public class SalarioComBonus {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo;
		double totalDeVendasMes;
		double totalComComissao;

		nomeVendedor = teclado.nextLine();
		salarioFixo = teclado.nextDouble();
		totalDeVendasMes = teclado.nextDouble();

		totalComComissao = (15 * totalDeVendasMes) / 100 + salarioFixo;

		System.out.printf("TOTAL = R$ %.2f\n", totalComComissao);

	}
}