import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        radius = in.nextDouble();

        area = Math.PI * Math.pow(radius,2);

        System.out.println("Sua área é de: "+area);
    }
}