public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que o clientes estão curtindo.");
        } else {
            System.out.println("Filme retro que vale a pena assistir.");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Este filme está incluído no plano.");
        } else {
            System.out.println("Este filme não está incluído no plano.");
        }

    }
}
