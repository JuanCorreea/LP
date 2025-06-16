import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Sequência de Fibonacci");
        System.out.print("Digite um número: ");
        int limite = in.nextInt();
        int a = 0;
        int b = 1;

        System.out.println(a);
        if (limite > 0) {
            System.out.println(b);
        }
        while(true){
            int proximo = a+b;
            if(proximo > limite){
                break;
            }
            System.out.println(proximo);
            a = b;
            b = proximo;
        }
    }
}