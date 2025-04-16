import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        double raio, altura, volume;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cilindro: ");
         raio = scanner.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        altura = scanner.nextDouble();


        volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("O volume do cilindro é de: "+volume);

    }
}
