import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitorManeiro = new Scanner(System.in);

        System.out.println("[Sera que e triangulo?]");
        System.out.println("Me entregue tres valores e eu te direi.");
        System.out.print("A: ");
        int pontoA = leitorManeiro.nextInt();
        System.out.print("B: ");
        int pontoB = leitorManeiro.nextInt();
        System.out.print("C: ");
        int pontoC = leitorManeiro.nextInt();

        if (pontoA < pontoB && pontoA < pontoC) {
            System.out.println("\nE UM TRIANGULO HAHAHAHA!!!!!!");
        } else {
            System.out.println("\nNao e um triangulo...");
        }
    }
}
