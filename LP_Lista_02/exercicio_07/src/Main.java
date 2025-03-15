import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milimetro, result;

        System.out.println("Digite a qntd. de milímetros: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        milimetro = in.nextDouble();


        result = milimetro / 25.4;

        System.out.println("A qntd de milímetros convertida para polegadas é:  "+ result);

    }
}