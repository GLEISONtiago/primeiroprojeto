import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro para ver sua tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de multiplicação do " + numero + ":");
        for (int i = 1; i < 11; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }
        System.out.println("Tabuada de soma do " + numero + ":");
        for (int i = 1; i < 11; i++) {
            int resultado = numero + i;
            System.out.println(numero + " + " + i + " = " + resultado);

        }
        System.out.println("Tabuada de divisão do " + numero + ":");
        for (int i = 1; i < 11; i++) {
            int resultado = numero / i;
            System.out.println(numero + " / " + i + " = " + resultado);

        }
        System.out.println("Tabuada de subtração do " + numero + ":");
        for (int i = 1; i < 11; i++) {
            int resultado = numero - i;
            System.out.println(numero + " - " + i + " = " + resultado);

        }


        sc.close();
    }
}
