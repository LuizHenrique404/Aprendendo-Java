import java.util.Scanner;

public class ParesDeCem {
    public static void main(String[] args) {
        Scanner leitorManeiroMassa = new Scanner(System.in);

        System.out.println("[(O_O) Pares de 0 a 100 (O_O)]");

        for (int n=0; n!=102; n+=2) {
            System.out.println(n);
        }
    }
}
