#Evaluativo #4: Escribir un programa que permita al usuario obtener un identificador para cada uno de los socios de un club.
#Para eso ingresara nombre completo y numero de DNI de cada socio, indicando que finalizara el procesamiento mediante el ingreso de un nombre vacio.
#Precondicion: el formato del nombre de los socios sera: nombre apellido. Podria ingresarse mas de un nombre, en cuyo caso sera: nombre1 nombre2 apellido.
#Si un socio tuviera mas de un apellido, el usuario solo ingresara uno.
#Se debe validar que el numero de cedula tenga 7 u 8 digitos. En caso contrario, el programa debe dejar al usuario en un bucle hasta que ingrese una cedula correcta.
#Por cada socio se debe imprimir su identificador unico, el cual estara formado por: el primer nombre, la cantidad de letras del apellido y los primeros 3 digitos de su DNI.


def lenUltimaPalabra(cadena):
   longitud=len(cadena)
   if longitud==0:
       return 0
   cantidad=0
   for i in range(longitud):
       if cadena[i]!=' ':
           cantidad+=1
       else:
           if cadena[i]==' ' and i<(longitud-1) and cadena[i+1]!=' ':
               cantidad=0
   return cantidad

 
def DNIvalido(dni):
   cantidad=0
   while dni!=0:
       cantidad+=1
       dni//=10
   return cantidad==7 or cantidad==8

 
def primerosTresDigitos(numero):
   while numero >= 1000:
     numero = numero // 10
   return numero

 
def obtenerIdentificador(nombre, dni):
   nombre=nombre.strip()
   id=nombre[:nombre.find(" ")]
   id=id+str(lenUltimaPalabra(nombre))
   id=id+str(primerosTresDigitos(dni))
   return id

 
#programa principal
nombre=input("Nombre del Socio: ")
while nombre!="":
   dni=int(input("Cedula del socio: "))
   while (DNIvalido(dni)):
      print("Numero invalido.")
      dni=int(input("Cedula del socio: "))
   print(obtenerIdentificador(nombre,dni))
   nombre=input("Nombre del socio: ")
