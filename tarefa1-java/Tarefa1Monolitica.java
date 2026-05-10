import java.util.Scanner;
import java.util.Locale;

public class Tarefa1Monolitica {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[5];

        double[][] notas = new double[5][3];

        double[] media = new double[5];

        String[] situacao = new String[5];

        for (int i = 0; i < alunos.length; i++) {

            System.out.print("Aluno: ");

            alunos[i] = sc.nextLine();

            for (int j = 0; j < notas[i].length; j++) {

                System.out.printf("%dª nota de %s: ", j + 1, alunos[i]);

                notas[i][j] = sc.nextDouble();

                media[i] += notas[i][j];
            }

            media[i] /= notas[i].length;

            if (media[i] >= 7.0) {

                situacao[i] = "Aprovado";

            }
            else if (media[i] >= 5.0) {

                situacao[i] = "Recuperação";

            }
            else {

                situacao[i] = "Reprovado";

            }

            sc.nextLine(); // limpa o buffer do teclado
        }

        System.out.println("\n--- RELATÓRIO FINAL ---");

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("\nAluno: " + alunos[i]);

            System.out.printf("Média: %.2f\n", media[i]);

            System.out.println("Situação: " + situacao[i]);

        }
        sc.close();
    }
}

