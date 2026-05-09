import java.util.Locale;

public class PassagemReferencia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Produto produto1 = new Produto();

        produto1.nome = "Café";
        produto1.preco = 40.45;

        System.out.printf("main - Antes do desconto o %s custava %.2f R$\n",
            produto1.nome,
            produto1.preco
        );

        aplicarDesconto(produto1);

        System.out.printf("main - Depois do desconto o %s custa %.2f R$\n",
            produto1.nome,
            produto1.preco
        );
    }

    public static void aplicarDesconto(Produto p) {

        System.out.println("aplicarDesconto - Antes do desconto o preço era: " + p.preco + " R$");

        double desconto = p.preco * 0.20; // 20% de desconto.

        p.preco-=desconto;

        System.out.println("aplicarDesconto - Depois do desconto o preço é: " + p.preco + " R$");
    }
}

class Produto {

    String nome;
    double preco;
}