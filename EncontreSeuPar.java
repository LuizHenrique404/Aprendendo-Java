import java.util.Scanner;

public class EncontreSeuPar {
    public static void main(String[] args) {
        Scanner leitorManeiroMassa = new Scanner(System.in);

        System.out.println("[Encontre seu par]");
        System.out.print("\nColoque seu numero: ");
        int numero = leitorManeiroMassa.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("seu numero e par!");
        } else {
            System.out.println("seu numero e impar!");
        }
    }
}
