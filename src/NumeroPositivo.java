import java.util.Locale;
import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        if (numero > 0) {
            System.out.println("O número é POSITIVO");
        } else if (numero < 0) {
            System.out.println("O número é NEGATIVO");
        } else {
            System.out.println("O número é NEUTRO");
        }
        leitura.close();
    }
}