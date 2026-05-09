produtos = []

escolha = 'S'

while escolha != 'N':

    nome = input("Produto: ")
    quantidade = int(input("Quantidade: "))
    preco = float(input("Preço unitário: R$ "))

    produtos.append({
        "produto": nome,
        "quantidade": quantidade,
        "preco": preco
    })

    escolha = input("Deseja inserir outro produto? [S/N] ").upper()

subtotal = 0
descontoTotal = 0

print("\n========= CUPOM =========\n")

for produto in produtos:

    totalProduto = produto["preco"] * produto["quantidade"]

    subtotal += totalProduto

    desconto = 0

    if totalProduto > 500:
        desconto = totalProduto * 0.10

    elif totalProduto > 200:
        desconto = totalProduto * 0.05

    descontoTotal += desconto

    print(f'Produto: {produto["produto"]}')
    print(f'Quantidade: {produto["quantidade"]}')
    print(f'Preço unitário: R$ {produto["preco"]:.2f}')
    print(f'Total: R$ {totalProduto:.2f}')
    print(f'Desconto: R$ {desconto:.2f}')
    print()

totalFinal = subtotal - descontoTotal

print("=========================")
print(f"Subtotal: R$ {subtotal:.2f}")
print(f"Desconto total: R$ {descontoTotal:.2f}")
print(f"Total final: R$ {totalFinal:.2f}")
print("=========================")