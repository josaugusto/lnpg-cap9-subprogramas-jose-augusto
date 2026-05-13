import math


def menu():
    print("\n===== CONVERSOR DE UNIDADES =====")
    print("1 - Metro para Quilômetro")
    print("2 - Metro para Centímetro")
    print("3 - Grama para Quilograma")
    print("4 - Litro para Mililitro")
    print("5 - Celsius para Fahrenheit")
    print("6 - Celsius para Kelvin")
    print("7 - Graus para Radianos")
    print("8 - Sair")


def metro_para_quilometro(valor):
    return valor / 1000


def metro_para_centimetro(valor):
    return valor * 100


def grama_para_quilograma(valor):
    return valor / 1000


def litro_para_mililitro(valor):
    return valor * 1000


def celsius_para_fahrenheit(valor):
    return (valor * 9 / 5) + 32


def celsius_para_kelvin(valor):
    return valor + 273.15


def graus_para_radianos(valor):
    return math.radians(valor)


# =========================
# Funções Auxiliares
# =========================


def ler_valor(mensagem):
    return float(input(mensagem))


def mostrar_resultado(valor, unidade):
    print(f"Resultado: {valor:.2f} {unidade}")


def executar_conversao(funcao, mensagem_entrada, unidade_saida):
    valor = ler_valor(mensagem_entrada)

    resultado = funcao(valor)

    mostrar_resultado(resultado, unidade_saida)


opcao = -1

while opcao != 8:
    menu()

    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        executar_conversao(metro_para_quilometro, "Metros: ", "km")

    elif opcao == 2:
        executar_conversao(metro_para_centimetro, "Metros: ", "cm")

    elif opcao == 3:
        executar_conversao(grama_para_quilograma, "Gramas: ", "kg")

    elif opcao == 4:
        executar_conversao(litro_para_mililitro, "Litros: ", "mL")

    elif opcao == 5:
        executar_conversao(celsius_para_fahrenheit, "Celsius: ", "°F")

    elif opcao == 6:
        executar_conversao(celsius_para_kelvin, "Celsius: ", "K")

    elif opcao == 7:
        executar_conversao(graus_para_radianos, "Graus: ", "rad")

    elif opcao == 8:
        print("Programa encerrado.")

    else:
        print("Opção inválida.")
