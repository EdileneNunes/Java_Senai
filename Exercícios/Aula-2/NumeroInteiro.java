
/**
Peça ao usuário para inserir um número inteiro e, em seguida, imprima se o número é par e se é positivo.
Não usar if-else. Utilize operadores booleanos para verificar essas condições. 
*/
import java.util.Scanner;

public class NumeroInteiro {
    public static void main(String[] args) {
        System.out.println("Insira o número inteiro: ");
        Scanner scanner = new Scanner((System.in));

        int valor = scanner.nextInt();

        boolean resultadoPar =  (valor % 2) == 0;

        boolean resultadoPositivo = (valor >= 0);

        System.out.println("Seu numero e par? " + resultadoPar);
        System.out.println("Seu numero e positivo?" + resultadoPositivo);

    }
}
