import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double quilometros, result;

        System.out.println("Digite a qntd. de quilômetros: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        quilometros = in.nextDouble();


        result = quilometros / 1.609;

        System.out.println("A qntd de quilometros convertida para milhas é:  "+ result);

    }
}