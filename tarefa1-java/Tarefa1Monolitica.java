import java.util.Scanner;
import java.util.Locale;

public class Tarefa1Monolitica {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {

            alunos[i] = new Aluno();

            alunos[i].notas = new double[3];

            System.out.print("Aluno: ");
            alunos[i].nome = sc.nextLine();

            for (int j = 0; j < alunos[i].notas.length; j++) {

                System.out.printf("%dª nota de %s: ", j + 1, alunos[i].nome);

                alunos[i].notas[j] = sc.nextDouble();

                alunos[i].media += alunos[i].notas[j];
            }

            alunos[i].media /= alunos[i].notas.length;

            if (alunos[i].media >= 7.0) {

                alunos[i].situacao = "Aprovado";

            }
            else if (alunos[i].media >= 5.0) {

                alunos[i].situacao = "Recuperação";

            }
            else {

                alunos[i].situacao = "Reprovado";

            }

            sc.nextLine(); // limpa o buffer do teclado
        }

        System.out.println("\n--- RELATÓRIO FINAL ---");

        for (Aluno aluno : alunos) {

            System.out.println("\nAluno: " + aluno.nome);

            System.out.printf("Média: %.2f\n", aluno.media);

            System.out.println("Situação: " + aluno.situacao);
        }

        sc.close();
    }
}

class Aluno {

    String nome;

    double[] notas;

    double media;

    String situacao;
}