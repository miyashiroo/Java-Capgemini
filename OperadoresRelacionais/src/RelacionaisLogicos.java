
public class RelacionaisLogicos {
	public static void main(String[] args) {
		
		//Operadores Relacionais
		// < > <= !=
		
		
		//testando igualdade
		int num1, num2, num3, num4;
		num1 = 10;
		num2 = 10;
		
		if(num1 == num2) {
			System.out.println("Num1 é igual a num2");
		}
			
		// desigualdade
		num1 = 30;
		num2 = 10;
		
		if(num1 != num2) {
			System.out.println("Num1 e num2 são diferentes");
		}
		
		// testando maior
		num1 = 21;
		num2 = 22;
		
		if(num1 > num2) {
			System.out.println("Num1 é maior q num2");
		} else {
			System.out.println("num2 é maior q num1");
		}
		
		
		// Operadores Lógicos
		num1 = 10;
		num2 = 5;
		num3 = 20;
		num4 = 5;
		
		if((num1 > num3) && (num2 == num4)) {
			System.out.println("primeira opcao satisfeita");
		} else {
			System.out.println("Segunda opçao satisfeita");
		}
		
		if((num1 > num3) || (num2 == num4)) {
			System.out.println("primeira opcao satisfeita");
		} else {
			System.out.println("Segunda opçao satisfeita");
		}
		
		
		
		
	}
}
