public class Banco {
	public static void main(String args[]) {
		Fila f = new Fila();
		int e;

		if (!f.isFull()) {
			f.inserir(176);
			f.inserir(914);
			f.inserir(12);
			f.inserir(1817);
			f.inserir(100);
		}
		
		while (!f.isEmpty()) {
			e = f.retirar(); 
			System.out.println("Senha da vez: "+e);
		}
	}	
}