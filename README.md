# Listado Personas App
Este código es una aplicación de consola en Java que permite gestionar un listado de personas. A continuación, explico en detalle el código:

## Estructura del código
El código se divide en tres secciones principales:

**Importación de bibliotecas**: Se importan las bibliotecas necesarias para el funcionamiento de la aplicación, como java.util.ArrayList, java.util.List y java.util.Scanner.

**Clase principal:** La clase principal se llama ListadoPersonasApp y contiene el método main, que es el punto de entrada de la aplicación.

**Métodos y funciones:** La clase principal contiene varios métodos y funciones que se utilizan para gestionar el listado de personas.

## Método main
El método main es el punto de entrada de la aplicación y se encarga de:

    1- Crear un objeto Scanner: Se crea un objeto Scanner llamado teclado para leer la entrada del usuario.
    2- Crear una lista de personas: Se crea una lista de personas vacía utilizando la clase ArrayList.
    3- Definir un menú: Se define un menú con tres opciones: agregar persona, listar personas y salir.
    4- Crear un ciclo while: Se crea un ciclo while que se repite hasta que el usuario elija la opción de salir.

### Método mostrarMenu
El método mostrarMenu se encarga de mostrar el menú de opciones al usuario.

### Método ejecutarOperacion
El método ejecutarOperacion se encarga de ejecutar la operación seleccionada por el usuario. Este método recibe como parámetros el objeto 

### Scanner y la lista de personas.
***Opción 1: Agregar persona***
Si el usuario selecciona la opción 1, se le pide que ingrese el nombre, teléfono y correo electrónico de la persona. Luego, se crea un objeto Persona con la información ingresada y se agrega a la lista de personas.

***Opción 2: Listar personas***
Si el usuario selecciona la opción 2, se muestra la lista de personas utilizando un ciclo forEach y el método println.

***Opción 3: Salir***
Si el usuario selecciona la opción 3, se muestra un mensaje de despedida y se sale del ciclo while.