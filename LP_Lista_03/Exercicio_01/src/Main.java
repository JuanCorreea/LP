import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, raiz;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        valor = in.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor inválido! ");
        } else {
            raiz = Math.sqrt(valor);
            System.out.println("O valor da sua raiz quadrada é de: " + raiz);
        }
    }
}