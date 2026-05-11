import java.util.Scanner;
import java.util.Locale;

public class Tarefa1Refatorada {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String[] alunos = lerAluno();
        double[][] notas = lerNotas(alunos);
        double[] medias = calcularMedia(alunos, notas);
        String[] situacoes = determinarSituacao(alunos, medias);
        imprimirRelatorio(alunos, medias, situacoes);

        sc.close();
    }

    public static String[] lerAluno() {

        String[] alunos = new String[5];

        for (int i = 0; i < alunos.length; i++) {

            System.out.print("Aluno: ");

            alunos[i] = sc.nextLine();
        }

        return alunos;
    }

    public static double[][] lerNotas(String[] alunos) {

        double[][] notas = new double[5][3];

        for (int i = 0; i < alunos.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {

                System.out.printf("%dª nota de %s: ", j + 1, alunos[i]);

                notas[i][j] = sc.nextDouble();
            }

            sc.nextLine(); // limpa o buffer
        }
        return notas;
    }

    public static double[] calcularMedia(String[] alunos, double[][] notas) {

        double[] media = new double[5];

        for (int i = 0; i < alunos.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {

                media[i] += notas[i][j];
            }

            media[i] /= notas[i].length;
        }

        return media;
    }

    public static String[] determinarSituacao(String[] alunos, double[] medias) {

        String[] situacoes = new String[5];

        for (int i = 0; i < alunos.length; i++) {

            if (medias[i] >= 7.0) {

                situacoes[i] = "Aprovado";

            } else if (medias[i] >= 5.0) {

                situacoes[i] = "Recuperação";

            } else {

                situacoes[i] = "Reprovado";
            }
        }

        return situacoes;
    }

    public static void imprimirRelatorio(String[] alunos, double[] medias, String[] situacoes) {

        System.out.println("\n--- RELATÓRIO FINAL ---");

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("\nAluno: " + alunos[i]);

            System.out.printf("Média: %.2f\n", medias[i]);

            System.out.println("Situação: " + situacoes[i]);
        }
    }
}