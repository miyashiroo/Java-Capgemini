
public class ComandoCondicional {

	public static void main(String[] args) {

		int num1 = 10, num2 = 30;
		
		if(num1 < num2) {
			System.out.println("if normalNumero 1 � menor que numero 2");
		}
		
		
		if(num1 > num2) {
			System.out.println("if com else Numero 1 � maior que numero 2");
		} else {
			System.out.println("if com else Numero 1 � menor que numero 2");
			
		}
		
		// COndi��o composta num1 < num2
		if(num1 > num2) {
			System.out.println("Condi��o composta 1 - Numero 1 � maior que numero 2");
		} else if (num1 < num2){
			System.out.println(" Condi��o composta 1 Numero 1 � menor que numero 2");
			
		} else {
			System.out.println(" Condi��o COmposta 1 Numero 1 � igual ao numero 2");
			
		}
		
		
		// condi��o composta situa��o num1 = num2 
		
		num1 = 30;
		if(num1 > num2) {
			System.out.println("Condi��o composta 2 - Numero 1 � maior que numero 2");
		} else if (num1 < num2){
			System.out.println("Condi��o composta 2 Numero 1 � menor que numero 2");
			
		} else {
			System.out.println("Condi��o composta 2 Numero 1 � igual ao numero 2");
			
		}
		
		
		// Comando condicional switch
		char opcao = '1';
		switch (opcao){
			case '1': {
				System.out.println("chame programa de inclus�o");
				break;
			}
			case '2': {
				System.out.println("chame programa de Altera�ao");
				break;
			}
			case '3': {
				System.out.println("chame programa de Exclus�o");
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
