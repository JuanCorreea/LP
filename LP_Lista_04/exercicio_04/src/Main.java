public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão: Celsius para Fahrenheit");
        System.out.println("Celsius\t   |\tFahrenheit\n");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("%d\t|\t%.1f%n", celsius, fahrenheit);
        }
    }
}