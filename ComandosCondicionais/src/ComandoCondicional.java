
public class ComandoCondicional {

	public static void main(String[] args) {

		int num1 = 10, num2 = 30;
		
		if(num1 < num2) {
			System.out.println("if normalNumero 1 é menor que numero 2");
		}
		
		
		if(num1 > num2) {
			System.out.println("if com else Numero 1 é maior que numero 2");
		} else {
			System.out.println("if com else Numero 1 é menor que numero 2");
			
		}
		
		// COndição composta num1 < num2
		if(num1 > num2) {
			System.out.println("Condição composta 1 - Numero 1 é maior que numero 2");
		} else if (num1 < num2){
			System.out.println(" Condição composta 1 Numero 1 é menor que numero 2");
			
		} else {
			System.out.println(" Condição COmposta 1 Numero 1 é igual ao numero 2");
			
		}
		
		
		// condição composta situação num1 = num2 
		
		num1 = 30;
		if(num1 > num2) {
			System.out.println("Condição composta 2 - Numero 1 é maior que numero 2");
		} else if (num1 < num2){
			System.out.println("Condição composta 2 Numero 1 é menor que numero 2");
			
		} else {
			System.out.println("Condição composta 2 Numero 1 é igual ao numero 2");
			
		}
		
		
		// Comando condicional switch
		char opcao = '1';
		switch (opcao){
			case '1': {
				System.out.println("chame programa de inclusão");
				break;
			}
			case '2': {
				System.out.println("chame programa de Alteraçao");
				break;
			}
			case '3': {
				System.out.println("chame programa de Exclusão");
				break;
			}
			case '4': {
				System.out.println("chame programa de Consulta");
				break;
			}
			default: {
				System.out.println("Deu pau");
				break;
			}
		}
		
		
		
		
		
		
	}

}
