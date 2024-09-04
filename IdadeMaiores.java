import java.util.Scanner;

public class IdadeMaiores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaMaiores = 0;
        int contadorMaiores = 0;

        System.out.println("Informe as idades das pessoas (digite -1 para parar):");

        // Entrada contínua das idades até o usuário digitar -1
        while (true) {
            System.out.print("Informe a idade (ou -1 para encerrar): ");
            
            // Verifica se a entrada é válida
            String input = scanner.nextLine();

            try {
                int idade = Integer.parseInt(input);

                // Verifica se o usuário deseja encerrar a entrada de idades
                if (idade == -1) {
                    break;
                }

                // Soma apenas as idades de pessoas maiores de idade
                if (idade >= 18) {
                    somaMaiores += idade;
                    contadorMaiores++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro válido.");
            }
        }

       //faz o calculo e exibe a soma e a media
        if (contadorMaiores > 0) {
            double mediaMaiores = (double) somaMaiores / contadorMaiores;
            String mediaFormatada = String.format("%.2f", mediaMaiores);
            System.out.println("Soma das idades maiores de idade: " + somaMaiores);
            System.out.println("Média das idades maiores de idade: " + mediaFormatada);
        } else {
            System.out.println("Não há pessoas maiores de idade.");
        }

        scanner.close();
    }
}