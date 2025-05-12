import java.util.Locale;

public class MediaNotas {
    public static void main(String[] args) {
        double nota1 = 6.4;
        double nota2 = 8.2;

       double media = ((nota1 + nota2) / 2);

        System.out.println("A média das duas notas é: "+ media);

        char letra = 'F';
        String nome = "ernando";

        System.out.println(letra+nome);

        double precoProduto = 50;
        int quantidade = 10;
        int resultado = (int) (precoProduto * quantidade);
        System.out.println("O valor total do produto é: " + resultado);

        double valorEmDolares = 10.00;
        double cambio = (valorEmDolares * 4.94);
        Locale.setDefault(Locale.US);
        System.out.printf("O valor de " + valorEmDolares +" reais transformado em dolar é: %.2f \n", cambio);

        double precoOriginal = 80;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal- ((precoOriginal * percentualDesconto) /100);
        System.out.println("Preço Original é de R$: "+precoOriginal);
        System.out.println("percentual de desconto é de: " + percentualDesconto + "%");
        System.out.printf("O preço do produto com desconto é de: %.2f", precoComDesconto);
    }
}
