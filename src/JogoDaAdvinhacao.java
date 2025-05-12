import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao{
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;

        for (int tentativas = 0; tentativas < 10; tentativas++) {

            System.out.println("Digite um número de 0 a 100: ");
            numeroDigitado = leitura.nextInt();

            if(numeroDigitado == numeroGerado){
                System.out.println("Parabéns você acertou em " + (tentativas + 1) + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o número gerado.");

            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }

        }

        if (numeroDigitado != numeroGerado) {
            System.out.println("Você não consegui acertar o número em 5 tentativas: o número era : " + numeroGerado);
        }
    }
}