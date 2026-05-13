<div style="text-align: justify">

# 📚 Atividades — Sistemas de Informação

- **Nome:** José Augusto Silva Santos  
- **Curso/Turma:** Sistemas de Informação  

---

## ▶️ Instruções de Execução

### ☕ Java

1. Certifique-se de possuir o **Java JDK** instalado em seu computador.
2. Abra o terminal na pasta onde o arquivo `.java` está localizado.
3. Compile o programa utilizando o comando:

```bash
javac NomeDoArquivo.java
```

4. Após a compilação, execute o programa com:

```bash
java NomeDoArquivo
```

> Substitua `NomeDoArquivo` pelo nome real do arquivo Java, sem a extensão `.java`.

---

### 🐍 Python

1. Certifique-se de possuir o **Python** instalado.
2. Abra o terminal na pasta onde o arquivo `.py` está localizado.
3. Execute o programa utilizando um dos comandos abaixo:

```bash
python nome_do_arquivo.py
```

## Tarefa 1 — Java

As minhas decisões de modularização na versão refatorada do programa foram tomadas com o objetivo de tornar o código mais organizado, reutilizável e fácil de manter em comparação à versão monolítica, onde toda a lógica estava concentrada apenas no método main.

Na versão refatorada, cada método possui uma responsabilidade específica. O método `lerAluno()` realiza a leitura dos nomes dos alunos, `lerNotas(alunos)` lê as notas, `calcularMedia(alunos, notas)` calcula as médias, `determinarSituacao(alunos, medias)` define a situação dos alunos e imprimirRelatorio(alunos, medias, situacoes) exibe o relatório final.

Essa divisão melhora a legibilidade do código, reduz a repetição e facilita a realização de futuras manutenções.

---

## Tarefa 2 — Python 

As partes mais repetitivas da versão monolítica inicial eram os vários loops for utilizados em cada etapa do programa. Havia um loop para calcular o subtotal, outro para calcular os descontos e outro para imprimir as informações dos produtos, o que deixava o código mais repetitivo e difícil de manter. Na versão monolítica final, eu utilizei apenas dois loops: um para ler os produtos individualmente e outro para obter os valores de subtotal, desconto e imprimir o cupom.

As partes que ficaram mais reutilizáveis foram as operações de calcular o subtotal de um determinado produto, o desconto por produto, desconto total e a parte de imprimir o cupom.

Uma melhoria importante foi a criação da função `calcular_desconto_produto()`. Antes, a mesma estrutura if e elif precisava ser repetida sempre que fosse necessário calcular o desconto de um produto. O uso dessa função evita a repetição desnecessária de código.

Caso seja necessário alterar alguma funcionalidade, basta modificar a função responsável por aquela tarefa específica, sem a necessidade de alterar várias partes do programa. Isso facilita a manutenção futura do código, melhora sua organização e legibilidade.

---

## Tarefa 3 — Java: Parâmetros

O valor original da variável `valor` não foi alterado porque, ao chamar o método `alterarNumero()`, foi passada apenas uma cópia do valor armazenado na variável, e não a variável em si.

Em Java, a passagem de parâmetros é feita por valor. Isso significa que o método recebe uma cópia do conteúdo da variável original. Assim, a variável `x` recebeu uma cópia do valor `10`.

Quando `x` foi alterada para `20` dentro do método `alterarNumero()`, apenas a cópia foi modificada. A variável original `valor`, que está no método `main`, permaneceu com o valor `10`.

---

## Tarefa 4 — Java: Referências

Java não possui passagem por referência verdadeira. Em Java, toda passagem de parâmetros é feita por valor.

Quando o objeto `produto1`, da classe `Produto`, é passado para o método `aplicarDesconto()`, o que é enviado não é o objeto em si, mas uma cópia da referência que aponta para ele.

Isso significa que a variável `p`, dentro do método `aplicarDesconto()`, passa a apontar para o mesmo objeto que a variável `produto1` no método `main`.

Por esse motivo, alterações feitas no conteúdo do objeto através de `p`, como a modificação do atributo `preco`, também afetam o objeto acessado por `produto1`, já que ambas as variáveis referenciam o mesmo objeto na memória.

---

## Tarefa 5 — Tema Livre


    Diagrama das chamadas:

    menu() ->
    executar_conversao(funcao, mensagem_entrada, unidade_saida)
        -> ler_valor(mensagem_entrada)
        -> funcao(valor)
        -> mostrar_resultado(resultado, unidade_saida)


Ao invés de possuir várias linhas de código repetidas para cada opção escolhida pelo usuário, como uma instrução para ler o valor, outra para calcular o resultado da conversão e outra para exibir a mensagem do valor convertido, é muito mais simples criar uma única função genérica para cada opção do usuário.

Essa função é executar_conversao(funcao, mensagem_entrada, unidade_saida), que recebe como parâmetro uma das funções principais de conversão, a mensagem que será exibida ao usuário e a unidade de medida correspondente ao resultado.

A maior dificuldade encontrada foi desenvolver uma função auxiliar genérica que pudesse funcionar corretamente para todas as opções de conversão escolhidas pelo usuário.

A principal vantagem da modularização é a possibilidade de dividir o programa em diversas partes independentes. Dessa forma, caso seja necessário alterar alguma operação, não é preciso procurar e modificar todos os trechos do código onde ela é utilizada. Com o uso de funções, basta alterar o corpo da função correspondente, o que facilita a manutenção, a organização e a reutilização do código.

---

</div>