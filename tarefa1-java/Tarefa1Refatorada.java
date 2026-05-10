import java.util.Scanner;
import java.util.Locale;

public class Tarefa1Refatorada {

    static String[] alunos = new String[5];

    static double[][] notas = new double[5][3];

    static double[] media = new double[5];

    static String[] situacao = new String[5];

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        lerAluno();
        lerNotas();
        calcularMedia();
        determinarSituacao();
        imprimirRelatorio();

        sc.close();
    }

    public static void lerAluno() {

        for (int i = 0; i < alunos.length; i++) {

            System.out.print("Aluno: ");

            alunos[i] = sc.nextLine();
        }
    }

    public static void lerNotas() {

        for (int i = 0; i < alunos.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {

                System.out.printf("%dª nota de %s: ", j + 1, alunos[i]);

                notas[i][j] = sc.nextDouble();
            }

            sc.nextLine(); // limpa o buffer
        }
    }

    public static void calcularMedia() {

        for (int i = 0; i < alunos.length; i++) {

            for (int j = 0; j < notas[i].length; j++) {

                media[i] += notas[i][j];
            }

            media[i] /= notas[i].length;
        }
    }

    public static void determinarSituacao() {

        for (int i = 0; i < alunos.length; i++) {

            if (media[i] >= 7.0) {

                situacao[i] = "Aprovado";

            } else if (media[i] >= 5.0) {

                situacao[i] = "Recuperação";

            } else {

                situacao[i] = "Reprovado";
            }
        }
    }

    public static void imprimirRelatorio() {

        System.out.println("\n--- RELATÓRIO FINAL ---");

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("\nAluno: " + alunos[i]);

            System.out.printf("Média: %.2f\n", media[i]);

            System.out.println("Situação: " + situacao[i]);
        }
    }
}