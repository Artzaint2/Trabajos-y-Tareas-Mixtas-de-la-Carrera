#Evaluativo #4: Crear un programa que permita al usuario elegir un candidato por el cual votar.
#Las posibilidades son: candidato A por el partido rojo, candidato B por el partido verde, candidato C por el partido
#azul. Según el candidato elegido (A, B ó C) se le debe imprimir el mensaje “Usted ha votado por el
#partido [color que corresponda al candidato elegido]”. Si el usuario ingresa una opción que no
#corresponde a ninguno de los candidatos disponibles, indicar “Opción errónea”.

candidato=input("Candidato Seleccionado: ")
if candidato.upper()=="A":
    print("Usted ha votado a favor del partido rojo")
elif candidato.upper()=="B":
    print("Usted ha votado a favor del partido azul")
elif candidato.upper()=="C":
    print("Usted ha votado a favor del partido verde")
else:
    print("ERROR: Seleccion incorrecta, por favor elija una opcion diferente.")


