#Evaluativo #1: Escriba un programa que pida tres números y que escriba si son los tres iguales, si hay dos iguales o si son los tres distintos.
def main():
    print("COMPARADOR DE TRES NÚMEROS")
    numero_1 = float(input("Ingrese un número: "))
    numero_2 = float(input("Ingrese otro número: "))
    numero_3 = float(input("Por Favor, Ingrese el ultimo numero: "))

    if (numero_1 == numero_2 != numero_3 or numero_1 == numero_3 != numero_2 or
        numero_2 == numero_3 != numero_1):
        print("Ha escrito uno de los números dos veces.")
    elif numero_1 == numero_2 == numero_3:
        print("Ha escrito tres veces el mismo número.")
    else:
        print("Los tres números que ha escrito son diferentes entre si.")


