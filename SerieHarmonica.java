import java.util.Scanner;

public class SerieHarmonica {

    public static double serieHarmonica(int n) {
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor de N
        System.out.print("Informe um numero inteiro positivo N: ");
        int n = scanner.nextInt();

        // Calcula e exibe o resultado da série harmônica
        double resultado = serieHarmonica(n);
        System.out.printf("Resultado da serie harmonica ate %d: %.2f%n", n, resultado);

        scanner.close();
    }
}