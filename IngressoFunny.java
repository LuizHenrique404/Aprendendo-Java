import java.util.Scanner;

public class IngressoFunny {
    public static void main(String[] args) {
        Scanner leitorManeiroMassa = new Scanner(System.in);

        System.out.println("[Categoria de ingresso]");
        System.out.println("A: Aposentado");
        System.out.println("E: Estudante");
        System.out.println("N: Normal");

        System.out.print("Qual a sua categoria: ");
        String categoria = leitorManeiroMassa.nextLine().toUpperCase();

        if ("A".equals(categoria)) {System.out.println("Seu ingresso ficou: R$"+(0.3 * 24));}
        if ("E".equals(categoria)) {System.out.println("Seu ingresso ficou: R$"+(0.5 * 24));}
        if ("N".equals(categoria)) {System.out.println("Seu ingresso ficou: R$24.0");}

    }
}