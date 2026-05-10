# 📚 Atividades — Sistemas de Informação

- **Nome:** José Augusto Silva Santos  
- **Curso/Turma:** Sistemas de Informação  

---

## Tarefa 1 — Java

Descrição ou link da atividade.

---

## Tarefa 2 — Python

Descrição ou link da atividade.

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