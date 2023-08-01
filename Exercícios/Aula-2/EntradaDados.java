
// Importa o Scanner para ler o teclado
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.print("Digite o seu nome");
        
        String nome = scanner.nextLine();

        scanner.close();

        System.out.println("Olá" + nome + "! Bem-Vndo(a) ao Java!!!!");;
    }
    
}
