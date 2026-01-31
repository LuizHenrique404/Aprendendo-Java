import java.util.Scanner;

public class MaisGrande {
    public static void main(String[] args) {
        Scanner leitorManeiroMassa = new Scanner(System.in);

        System.out.println("[Qual o maior]");
        System.out.print("\nN1: ");
        float n1 = leitorManeiroMassa.nextFloat();
        System.out.print("N2: ");
        float n2 = leitorManeiroMassa.nextFloat();

        if (n1 > n2) {
            System.out.println(n1+" e maior que "+n2);
        } else {
            System.out.println(n2+" e maior que "+n1);
        }
    }
}