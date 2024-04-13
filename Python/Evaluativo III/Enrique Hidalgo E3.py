# Evaluativo #3: Solicitar al usuario el ingreso de numeros primos.
# La lectura finalizara cuando ingrese un numero que no sea primo. Por cada numero, mostrar la suma de sus digitos.
# Tambien solicitar al usuario un digito e informar la cantidad de veces que aparece en el numero (frecuencia).
# Al finalizar el programa, mostrar el factorial del mayor numero ingresado.

def primo(num):
   for i in range(2,num):
       if num%i==0:           
           return False
   return True
def frecuencia(numero,digito):
   cantidad=0


   while numero!=0:
       ultDigito=numero%10
       if ultDigito==digito:
           cantidad+=1
       numero=numero//10
   return cantidad
def factorial(numero):
   f=1


   if numero!=0:
       for i in range(1,numero+1):
           f=f*i
   return f
def sumaDigitos(numero):
  suma=0


  while numero!=0:
      digito=numero%10
      suma=suma+digito
      numero=numero//10
  return suma
mayor=0


numero=int(input("Numero Primo: "))
while primo(numero):
    print("Suma de los Digitos: ",sumaDigitos(numero))
    digito=int(input("Digito: "))
    print("El",digito,"aparece",frecuencia(numero,digito),"veces")
    if numero > mayor:
          mayor=numero
    numero=int(input("Numero primo: "))
print("Factorial de",mayor,":",factorial(mayor))
