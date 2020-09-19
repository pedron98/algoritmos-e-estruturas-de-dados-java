public class Conversor {
	public static void main(String args[]) {
		Pilha p = new Pilha();

		int numero = Integer.parseInt(args[0]);
		int resto;
		
		if (!p.isFull()) {
			while (numero != 0) {
				resto = numero % 2;
				p.push(resto);
				numero /= 2;
			}
			while (!p.isEmpty()) {
				resto = p.pop();
				System.out.print(resto);
			}
		}
		else {
			System.out.println("A pilha está cheia!");
		}

		System.out.println("\nFim do programa!");

	}
}

/*
Lógica de conversão decimal/binário (divisões sucessivas por 2)

172(10) = 10101100(2) 

172 / 2
  0  86 / 2
  	  0  43 / 2
          1  21 / 2
              1  10 / 2
                  0  5 / 2
                     1   2 / 2
                         0   1 / 2
                        	 1   0
 
*/  