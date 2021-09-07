package calculadora;

 import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro N�mero:");
			float num1 = teclado.nextFloat();
			
		System.out.println("Digite o segundo N�mero:");	
			float num2 = teclado.nextFloat();
			
		teclado.close();
			
		float resultadoSoma = calc.somar(num1, num2);
		System.out.printf("\nO resultado da soma � %.2f",resultadoSoma);
		
		float resultadoSubtracao = calc.subtrair(num1, num2);
		System.out.printf("\nO resultado da Subtra��o � %.2f",resultadoSubtracao);
		
		float resultadoMultiplicar = calc.multiplicar(num1, num2);
		System.out.printf("\nO resultado da multiplica��o � %.2f",resultadoMultiplicar);
		
		float resultadoDivisao = calc.divisao(num1, num2);
		System.out.printf("\nO resultado da divis�o � %.2f",resultadoDivisao);
		
		float raizQuadrada = calc.raizQuadrada(num1, num2);
		System.out.printf("\nA raiz quadrada � %.2f",raizQuadrada);
		
		float restoDaDivisao = calc.restoDaDivisao(num1, num2);
		System.out.printf("\nO resto da divisao � %.2f",restoDaDivisao);
	}

}
