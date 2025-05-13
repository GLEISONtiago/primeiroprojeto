import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou impar: ");
        int numero = leitura.nextInt();

        if ((numero % 2) != 0) {
            System.out.println("Este número é ímpar!");

        } else {
            System.out.println("Este número é par!");
        }

        leitura.close();

    }
}
