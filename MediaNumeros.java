import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[20];
        double soma = 0;

        // Entrada dos 20 números
        for (int i = 0; i < 20; i++) {
            System.out.print("Informe o numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        // Calcula a média
        double media = soma / 20;
        System.out.printf("Media dos numeros: %.2f%n", media);

        // Imprime os números menores que a média em colunas
        System.out.println("Numeros menores que a media:");
        int contador = 0;
        for (int i = 0; i < 20; i++) {
            if (numeros[i] < media) {
                System.out.printf("%-10.2f", numeros[i]);
                contador++;
                if (contador % 5 == 0) {
                    System.out.println();
                }
            }
        }
        if (contador % 5 != 0) {
            System.out.println();
        }

        scanner.close();
    }
}