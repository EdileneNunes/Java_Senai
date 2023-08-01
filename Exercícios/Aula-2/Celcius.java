
/*Peça ao usuário para inserir uma temperatura em graus Celsius (número real) e, em seguida, imprima
a temperatura equivalente em graus Fahrenheit. Use a fórmula: Fahrenheit = Celsius * 9/5 + 32. */

import java.util.Scanner;

public class Celcius {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite a temperatura em celcius: ");

        int celciusTemp = scanner.nextInt();
       
        scanner.close();

        int Fahrenheit = celciusTemp * 9/5 + 32;







        System.out.println("Temperatura em Fahrenheit: " + Fahrenheit);
    }
    
}
