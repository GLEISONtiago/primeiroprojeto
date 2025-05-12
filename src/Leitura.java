import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito? ");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);

        System.out.println("Qual a sua avaliação do filme? ");

        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);
    }
}
