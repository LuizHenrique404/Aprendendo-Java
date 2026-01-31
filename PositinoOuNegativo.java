import java.util.Scanner;

public class PositinoOuNegativo {
    public static void main(String[] args) {
        Scanner leitorManeiroMassa = new Scanner(System.in);

        System.out.println("[Positivo ou Negativo]\n");

        System.out.print("Digite um numero: ");
        float numero = leitorManeiroMassa.nextFloat();

        while (numero > 0)
        {
            System.out.print("Digite um numero: ");
            numero = leitorManeiroMassa.nextFloat();
        }
    }
}