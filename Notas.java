import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner leitorMassaDemais = new Scanner(System.in);
        System.out.println("[Calculadora de medias iradas]");
        System.out.print("Primeiramente quem e voce?: ");
        String nomeDoCaba = leitorMassaDemais.nextLine();

        System.out.println("\nInteressante " + nomeDoCaba + ". Agora me diga as suas notas.");
        System.out.print("Nota da prova 1: ");
        float prova1 = leitorMassaDemais.nextInt();
        System.out.print("Nota da prova 2: ");
        float prova2 = leitorMassaDemais.nextInt();
        System.out.print("Nota da prova 3: ");
        float prova3 = leitorMassaDemais.nextInt();
        System.out.print("Nota da prova 4: ");
        float prova4 = leitorMassaDemais.nextInt();

        Float media = (prova1 + prova2 + prova3 + prova4) / 4;
        System.out.println("\nSua media foi " + media);

        if (media >= 7) {
            System.out.println("Massa parceiro, voce conseguiu a proeza de passar.");
        } else {
            System.out.println("MUITO RUIM, vai fazer tudo de novo.");
        }
    }
}
