import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = leitura.nextInt();
        System.out.println("Digite um segundo número: ");
        int numero2 = leitura.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número digitado " + numero1 + " é maior que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("O segundo número digitado " + numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Os dois números digitados são iguais!");
        }
        leitura.close();
    }
}
