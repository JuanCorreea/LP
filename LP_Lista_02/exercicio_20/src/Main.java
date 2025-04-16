import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, n1, n2;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os valores de n1 e n2 separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        a = (-n1) + (-n2);
        b = (-n1) * (-n2);

        System.out.println("x² + " + a + "x + " + b + " = 0");
    }
}