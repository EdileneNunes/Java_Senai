/*
 * Peça ao usuário para inserir os tamanhos dos três lados de um triângulo (números reais) e, em seguida, imprima se é possível formar
um triângulo com esses lados. Utilize operadores comparativos para verificar se a soma de dois lados é maior do que o terceiro lado.
 */
import java.util.Scanner;

 public class Triangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.println("Digite o tamanho do primeiro lado do triângulo: ");
        float num1 = scanner.nextFloat();

        System.out.println("Digite o tamanho do segundo lado do triângulo: ");
        float num2 = scanner.nextFloat();

        System.out.println("Digite o tamanho do terceiro lado do triângulo: ");
        float num3 = scanner.nextFloat();

        boolean resultado = (num1 + num2) >= num3;

        System.out.println("Resultado: " + resultado);

    }
    
}
