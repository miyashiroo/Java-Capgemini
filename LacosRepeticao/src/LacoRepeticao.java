
public class LacoRepeticao {
	public static void main(String[] args) {
		
		//comando while - laço pré-testado
		int qtdVezes = 1;
		System.out.println("Comando while");
		while(qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + " vez");
			qtdVezes++;
		}
		
		System.out.println("Sai do laço e executei " + (qtdVezes -1 ));
	
	
		//comando do while - laço pós-testado
		System.out.println("COmando do while");
		qtdVezes = 1;
		
		do {
			System.out.println("Estou fazendo a " + qtdVezes + " vez");
			qtdVezes++;
			
		} while (qtdVezes <= 10 ); 
		System.out.println("Sai do laço e executei " + (qtdVezes -1 ));
	
		
		// For
		System.out.println("COMANDO FOR");
		for (int quant = 0; quant <= 10; quant++) {
			System.out.println("Estou fazendo a  " + quant + " vezes");
		}
		
	}
}
