import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2, result;

        System.out.println("Digite n1: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        n1 = in.nextDouble();

        System.out.println("Digite n2:  ");

        in = new Scanner(System.in);
        n2 = in.nextDouble();

        result = (n1+n2)/2;

        System.out.println("A média das somas é: "+ result);

    }
}