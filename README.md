<div style="text-align: justify">

# 📚 Atividades — Sistemas de Informação

- **Nome:** José Augusto Silva Santos  
- **Curso/Turma:** Sistemas de Informação  

---

## Tarefa 1 — Java (RASCUNHO)

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

Descrição ou link da atividade.

---

</div>