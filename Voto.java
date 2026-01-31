import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner leitorDeInputs = new Scanner(System.in);
        System.out.println("[Sera que pode votar?] - [Maligno >:D]");
        System.out.println("Muahahahaha! >:D");
        System.out.print("Diga-me sua idade: ");
        int idade = leitorDeInputs.nextInt();

        if (idade >= 16 && idade <= 18 || idade > 65) {
            System.out.println("Eleitor facultativo");
            System.out.println("\nVota ai se tu quiser");
            System.out.println("MUAHAHAHAHA!!!!!!!! *Raios normais*");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor Obrigatorio");
            System.out.println("\nVOCE TERA VOTAR!!!!!!!!!");
            System.out.println("MUAHAHAHAHA!!!!!!!!!! *Barulhos de raios vilanescos*");
        } else {
            System.out.println("Nao Eleitor");
            System.out.println("\nNao pode votar");
            System.out.println("Nem vem patrao >:(");
        }
    }
}
