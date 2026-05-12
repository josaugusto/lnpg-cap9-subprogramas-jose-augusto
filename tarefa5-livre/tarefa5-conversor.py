"""
conversor de unidades

Comprimento

    metro ↔ quilômetro
    metro ↔ centímetro
    metro ↔ milímetro

Massa/Peso

    grama ↔ quilograma
    quilograma ↔ libra
    tonelada ↔ quilograma

Volume

    litro ↔ mililitro

Tempo

    segundos ↔ minutos
    minutos ↔ horas
    horas ↔ dias

Temperatura

    Celsius ↔ Fahrenheit
    Celsius ↔ Kelvin

Ângulo

    graus ↔ radianos

"""

# Conversor de Unidades em Python

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


opcao = -1

while opcao != 8:
    menu()

    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        metro = float(input("Metros: "))

        resultado = metro_para_quilometro(metro)

        print(f"Resultado: {resultado:.2f} km")

    elif opcao == 2:
        metro = float(input("Metros: "))

        resultado = metro_para_centimetro(metro)

        print(f"Resultado: {resultado:.2f} cm")

    elif opcao == 3:
        grama = float(input("Gramas: "))

        resultado = grama_para_quilograma(grama)

        print(f"Resultado: {resultado:.2f} kg")

    elif opcao == 4:
        litro = float(input("Litros: "))

        resultado = litro_para_mililitro(litro)

        print(f"Resultado: {resultado:.2f} mL")

    elif opcao == 5:
        celsius = float(input("Celsius: "))

        resultado = celsius_para_fahrenheit(celsius)

        print(f"Resultado: {resultado:.2f} °F")

    elif opcao == 6:
        celsius = float(input("Celsius: "))

        resultado = celsius_para_kelvin(celsius)

        print(f"Resultado: {resultado:.2f} 𝐾")

    elif opcao == 7:
        graus = float(input("Graus: "))

        resultado = graus_para_radianos(graus)

        print(f"Resultado: {resultado:.2f} rad")

    elif opcao == 8:
        print("Programa encerrado.")

    else:
        print("Opção inválida.")