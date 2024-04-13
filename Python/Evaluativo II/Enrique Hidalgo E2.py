#Evaluativo #2: Escriba un programa que pida los coeficientes de una ecuación de segundo grado
#(a x² + b x + c = 0) y escriba la solución.
#Se recuerda que una ecuación de segundo grado puede no tener solución, tener una solución
#unica, tener dos soluciones o que todos los números sean solución.

def main():
    print("Ecuacion A X² + B X + C = 0")
    a = float(input("Ingrese el valor de el coeficiente A: "))
    b = float(input("Ingrese el valor de el coeficiente B: "))
    c = float(input("Ingrese el valor de el coeficiente C: "))

    d = b * b - 4 * a * c
    if a == b == c == 0:
        print("Todos los números son solución.")
    elif a == b == 0:
        print("La ecuación no tiene solución.")
    elif c == 0:
        print("La ecuación tiene una solución: {- c / b}")
    elif d < 0:
        print("La ecuación no tiene solución real.")
    elif d == 0:
        print("La ecuación tiene una solución: {- b / (2 * a)}")
    else:
        print(
            "La ecuación tiene dos soluciones: {(-b - d ** 0.5) / (2 * a)} y {(-b + d ** 0.5) / (2 * a)}"
        )