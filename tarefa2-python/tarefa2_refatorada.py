def ler_produto():
    produtos = []

    escolha = "S"

    while escolha != "N":
        nome = input("Produto: ")
        quantidade = int(input("Quantidade: "))
        preco = float(input("Preço unitário: R$ "))

        produtos.append({"produto": nome, "quantidade": quantidade, "preco": preco})

        escolha = input("Deseja inserir outro produto? [S/N] ").upper()

    return produtos


def calcular_subtotal(produtos):

    subtotal = 0

    for produto in produtos:
        totalProduto = produto["preco"] * produto["quantidade"]

        subtotal += totalProduto

    return subtotal


def calcular_desconto_produto(totalProduto):

    desconto = 0

    if totalProduto > 500:
        desconto = totalProduto * 0.10

    elif totalProduto > 200:
        desconto = totalProduto * 0.05

    return desconto


def calcular_desconto(produtos):

    descontoTotal = 0

    for produto in produtos:
        totalProduto = produto["preco"] * produto["quantidade"]

        desconto = calcular_desconto_produto(totalProduto)

        descontoTotal += desconto

    return descontoTotal


def calcular_total():

    return calcular_subtotal(produtos) - calcular_desconto(produtos)


def imprimir_cupom(produtos):

    print("\n========= CUPOM =========\n")

    for produto in produtos:
        totalProduto = produto["preco"] * produto["quantidade"]

        desconto = calcular_desconto_produto(totalProduto)

        print(f"Produto: {produto['produto']}")
        print(f"Quantidade: {produto['quantidade']}")
        print(f"Preço unitário: R$ {produto['preco']:.2f}")
        print(f"Total: R$ {totalProduto:.2f}")
        print(f"Desconto: R$ {desconto:.2f}")
        print()

    subTotal = calcular_subtotal(produtos)
    descontoTotal = calcular_desconto(produtos)
    totalFinal = calcular_total()

    print("=========================")
    print(f"Subtotal: R$ {subTotal:.2f}")
    print(f"Desconto total: R$ {descontoTotal:.2f}")
    print(f"Total final: R$ {totalFinal:.2f}")
    print("=========================")


produtos = ler_produto()
imprimir_cupom(produtos)
