import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double polegadas, result;

        System.out.println("Digite a qntd. de polegadas: ");

        Scanner in = new Scanner(System.in); //configura o Scanner
        polegadas = in.nextDouble();


        result = polegadas * 25.4;

        System.out.println("A qntd de polegadas convertida para milimetros é:  "+ result);

    }
}