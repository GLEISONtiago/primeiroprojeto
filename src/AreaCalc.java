import java.util.Scanner;

public class AreaCalc {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1. Calcular área do quadrado.");
            System.out.println("2. Calcular área do circulo.");
            System.out.println("3. Sair.");
            System.out.println("Digite o número da opção: ");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    calcularQuadrado(leitura);
                    break;
                case 2:
                    calcularCirculo(leitura);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. tente novamente com as opções listadas acima.");
            }
            System.out.println();
        } while (opcao != 3);

        leitura.close();
    }

    public static void calcularQuadrado(Scanner leitura) {
        System.out.println("Digite o lado do quadrado: ");
        double lado = leitura.nextDouble();
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);

    }

    public static void calcularCirculo(Scanner leitura) {
        System.out.println("Digite o raio do círculo: ");
        double raio = leitura.nextDouble();
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);

    }
}

