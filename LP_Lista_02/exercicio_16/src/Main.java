import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, altura, volume;

        System.out.print("Digite o raio do cone: ");
         raio = scanner.nextDouble();

        System.out.print("Digite a altura do cone: ");
         altura = scanner.nextDouble();


        volume = (1.0 / 3) * Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("O volume do cone é de: "+volume);

    }
}
