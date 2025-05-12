//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;

        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;

        //Media calculada com ordem de precedencia, por isso tem parenteses.

        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println("A média da nota do filme é: " + media);
        String sinopse;
        sinopse = """
                Filme top Gun
                Filme de Aventura dos anos 80
                com ano do lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);


       
        }
    }