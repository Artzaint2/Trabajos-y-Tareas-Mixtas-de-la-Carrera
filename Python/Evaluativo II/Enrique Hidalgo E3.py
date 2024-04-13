#Evaluativo #3: Escribir un programa que solicite al usuario una letra y, si es una vocal, muestre el mensaje “es vocal”.
# Se debe validar que el usuario ingrese sólo un carácter. Si ingresa un string de más de un carácter, 
# informarle que no se puede procesar el dato.

letra=input("Escriba una letra: ")

while len(letra)>1:
    print("Porfavor, escriba un letra de un solo caracter: ")
    letra=input("Escriba una letra: ")

if len(letra)==1:
    if letra=="a"  or letra=="e" or letra=="i" or letra=="o" or letra=="u" or letra=="A" or letra=="E" or letra=="I" or letra=="O" or letra=="U":
    
        print("Es vocal") 
    else:
        print("No es vocal")
