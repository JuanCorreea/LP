import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2, peso, result;

        System.out.println("Digite n1: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        n1 = in.nextDouble();

        System.out.println("Digite n2:  ");

        in = new Scanner(System.in);
        n2 = in.nextDouble();

        peso = n2 * 2;
        result = (n1 + peso)/3;

        System.out.println("A média das somas é: "+ result);

    }
}