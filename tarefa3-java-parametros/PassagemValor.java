public class PassagemValor {

    public static void main(String[] args) {
        int valor = 10;

        System.out.println("main - Valor antes da chamada: " + valor);

        alterarNumero(valor);

        System.out.println("main - Valor depois da chamada: " + valor);
    }

    public static void alterarNumero(int x) {
        System.out.println("alterarNumero - Antes da alteração: " + x);

        x = 20;

        System.out.println("alterarNumero - Depois da alteração: " + x);
    }
}