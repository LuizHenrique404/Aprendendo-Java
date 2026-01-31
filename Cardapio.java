import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner leitorManeiroMassa = new Scanner(System.in);
        int salvadoreno = 545;
        int italiano = 750;
        int japones = 342;

        int refrigerante = 90;
        int suco = 80;
        int cha = 30;

        System.out.println("[Cardapio massa]");
        System.out.println("O que desejas?.");
        System.out.println("[1] Salvadoreno: 545 Calorias");
        System.out.println("[2] Italiano: 750 Calorias");
        System.out.println("[3] Japones: 342 Calorias");
        System.out.print("Prato: ");
        int prato = leitorManeiroMassa.nextInt();

        System.out.println("\n[1] Suco de laranjinha: 80 Calorias");
        System.out.println("[2] Refrigerante: 90 Calorias");
        System.out.println("[3] Cha: 30 Calorias");
        System.out.print("Bebida: ");
        int bebida = leitorManeiroMassa.nextInt();

        if (prato == 1) {prato = salvadoreno;}
        if (prato == 2) {prato = italiano;}
        if (prato == 3) {prato = japones;}

        if (bebida == 1) {bebida = suco;}
        if (bebida == 2) {bebida = refrigerante;}
        if (bebida == 3) {bebida = cha;}

        double totalCalorico = prato + bebida;
        System.out.println("\nO total de calorias consumida: " + totalCalorico);        
    }
}
