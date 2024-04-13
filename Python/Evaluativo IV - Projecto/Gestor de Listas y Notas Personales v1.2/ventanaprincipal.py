from tkinter import *
from tkinter import filedialog
from PIL import Image, ImageTk
import os 

directorio = os.getcwd

# función para el borrado de texto en la lista
def limpiarCampos(textoLista):   
    textoLista.delete(1.0, END)

#funcion para el cargado de texto
def abrir_archivo(lista):
    filepath=filedialog.askopenfilename(initialdir= directorio,
                        defaultextension='.txt',
                        filetypes=[
                            ("txt files",".txt"),
                            ("all files",".*")
                        ])
    title=("Seleccione un archivo para abrir.")   
    archivo = open(filepath, "r")
    texto = archivo.read()
    lista.insert(END, texto)
    archivo.close()

#funcion para el guardado de texto
def guardarArchivo(lista):
    archivo = filedialog.asksaveasfile(initialdir=directorio,
                        defaultextension='.txt',
                        filetypes=[
                            ("txt files",".txt"),
                            ("all files", ".*"),
                        ])
    if archivo is None:
        return  
    filetext = str(lista.get(1.0,END))
    archivo.write(filetext)
    archivo.close()

def borrarArchivo():
    archivo = filedialog.askopenfilename(initialdir=directorio,
                        defaultextension='.txt',
                        filetypes=[
                            ("txt files",".txt"),
                            ("all files", ".*"),
                        ])
    if archivo is None:
        return  
    os.remove(archivo)


# estas 3 lineas son para la ventana principal del programa, donde todas las opciones seran accesibles
Ventana = Tk()
Ventana.geometry('850x500')
Ventana.title('Gestor de Listas y Notas Personales')
Ventana.configure(bg="salmon")

#Esto cumple la funcion de mostrar el logo de la Universidad en el pograma
abrirImagen = Image.open(r"C:\Users\Usuario\Desktop\Stuff\Proyectos Prog. Urbe\Python\Evaluativo IV - Projecto\Gestor de Listas y Notas Personales v1.2\logourbe.jpg")
img = abrirImagen.resize((150, 100))
imagen = ImageTk.PhotoImage(img)
panel = Label(Ventana, image = imagen)
panel.grid(row=1,column=2)

#Label para introducir el nombre de los creadores del programa
label = Label(Ventana,text="Creado por: Walter Raleigh y Enrique Hidalgo",font=('Arial',22),bg="salmon")
label.place(x=200,y=10)

#estas dos lineas son para el cuadro de texto principal, en el que se introducira y cargara el texto deseado.
listbox = Text(Ventana)
listbox.place(relx=0.235,rely=0.175, relwidth=0.7,relheight=0.7,)

#esto añade una barra de scroll, para facilitar la lectura
scrollbar = Scrollbar(listbox)
scrollbar.pack(side = RIGHT, fill = BOTH)
listbox.config(yscrollcommand = scrollbar.set)
scrollbar.config(command = listbox.yview)

#estas dos lineas son para el boton de borrar todo en el cuadro de texto principal.
cuadro_borrar = Button(Ventana, text = "Borrar datos", command = lambda: limpiarCampos(listbox))
cuadro_borrar.place(relx = 0.025, rely = 0.40)
cuadro_borrar.configure(bg="salmon")

#estas dos lineas son para el boton de guardado del archivo de texto, una vez introducido su nombre.
cuadro_guardar = Button(Ventana, text = "Guardar datos", command= lambda: guardarArchivo(listbox))

cuadro_guardar.place(relx = 0.025, rely = 0.55)
cuadro_guardar.configure(bg="salmon")

#Estas lineas son para el boton de borrar los archivos de texto
cuadro_borrar_archivo = Button(Ventana, text = "Borrar Archivo", command= lambda: borrarArchivo())
cuadro_borrar_archivo.place(relx = 0.025, rely= 0.70)
cuadro_borrar_archivo.configure(bg="salmon")


cuadro_cargar = Button(Ventana, text = "Cargar datos",command= lambda: abrir_archivo(listbox))
cuadro_cargar.place(relx = 0.025, rely = 0.85)
cuadro_cargar.configure(bg="salmon")

#estas dos lineas son para el boton de cargado del archivo de texto, una vez introducido su nombre.
cuadro_cargar = Button(Ventana, text = "Cargar datos",command= lambda: abrir_archivo(listbox))
cuadro_cargar.place(relx = 0.025, rely = 0.85)
cuadro_cargar.configure(bg="salmon")

#esta linea crea un loop infinito, evitando que el progrma se cierre hasta que el usuario lo permita.
Ventana.mainloop()