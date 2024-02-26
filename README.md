Link a mi repositorio: https://github.com/Tapiiaa/Tapia_Pedro_UD6.git
# Tarea 6 TÉCNICAS DE PROGRAMACIÓN

# 1. EJERCICIO 1
## 1.1. Enunciado: 
Desarrollar dos funciones para comparar números reales.
La primera función devuelve el mayor de dos números, y la segunda clasifica los números retornando 0 si son iguales, 1 si el primero es mayor, y -1 en caso contrario.
Implementar un algoritmo principal que utilice estas funciones.
## 1.2. Pseudocódigo:
función mayorDeDos(número1, número2):
si número1 > número2:
return número1
return número2

función clasificarNúmeros(número1, número2):
si número1 == número2:
return 0
si número1 > número2:
return 1
return -1

número1 = obtenerNúmero("Ingrese el primer número: ")
número2 = obtenerNúmero("Ingrese el segundo número: ")
mayor = mayorDeDos(número1, número2)
clasificación = clasificarNúmeros(número1, número2)
imprimir("El mayor es: ", mayor, " y la clasificación es: ", clasificación)
## 1.3. Solución:
#### Para este ejercicio, he creado dos clases. La primera, llamada "Comparador", contiene el método main del ejercicio, donde se le pide al usuario que ingrese dos valores para que se proceda a la comparación. 
#### La segunda clase, llamada "ComparadorDeNumerosReales", tiene un constructor que recibe por parámetros dos enteros, donde se obtienen los getters y setters y el méotodo comparar(), que compara con un if los dos números y devuelve el resultado de la comparación.
#### Además, en esta clase también está el méotodo clasificador(), que en el caso de que los números sean iguales devuelve 0, si a>b devuelve 1 y si b>a devuelve -1.
#### Un test está implementado para comprobar que el método comparar() funciona correctamente.
#### También se adjunta el diagrama UML del ejercicio.
# 2. EJERCICIO 2
## 2.1. Enunciado:
Mejorar el algoritmo de la guerra de barcos dividiéndolo en varios procedimientos y funciones, incluyendo inicialización y visualización del tablero, entrada de datos y acción de disparo.
## 2.2. Pseudocódigo:

procedimiento inicializarTablero(tablero):
# Lógica de inicialización

procedimiento mostrarTablero(tablero):
# Lógica para mostrar el tablero

función introducirEnteroEntreLimites(mínimo, máximo):
# Lógica para obtener un entero dentro de los límites

función disparar(tablero, fila, columna):
# Lógica para realizar un disparo

algoritmo principal:
tablero = crearTablero()
inicializarTablero(tablero)
mostrarTablero(tablero)
fila = introducirEnteroEntreLimites(1, 4)
columna = introducirEnteroEntreLimites(1, 4)
resultado = disparar(tablero, fila, columna)
si resultado:
imprimir("Tocado y hundido")
## 2.3. Solución:
#### Para este ejercicio, me he basado en la guerra de barcos de la práctica anterior. 
#### Para introducirme en el mundo de los principios SOLID, he intentado separar las clases para que estas tengan una única función y una única responsabilidad. 
#### He creado una clase "Tablero", la cual creaba un tablero para implementarlo posteriormentente en la clase "Juego".
#### He creado la clase juego, que contiene el método main, donde se le pide al usuario que ingrese las coordenadas para situar su barco y posteriormente, al segundo usuario que ingrese las coordenadas para lanzar su disparo 
#### Además, se ha creado una clase barco con un constructor para crear un objeto barco en la clase "Juego".
#### Adicionalmente, se creó una interfaz "Disparar", que contiene un método disparar() que se implementa en la clase "Juego".
#### Finalmente, se ha creado un diagrama UML del ejercicio.

# 3. EJERCICIO 3
## 3.1. Enunciado:
Crear una función que genere una tabla de diez enteros con valores aleatorios entre límites dados.
Desarrollar otra función que encuentre el mayor valor en una tabla.
Luego, escribir un algoritmo principal que use estas funciones.
## 3.2. Pseudocódigo:
función crearTablaAleatoria(tamaño, mínimo, máximo):
tabla = []
para i de 1 a tamaño:
tabla.agregar(aleatorioEntre(mínimo, máximo))
return tabla

función encontrarMayor(tabla):
mayor = tabla[0]
para cada valor en tabla:
si valor > mayor:
mayor = valor
return mayor

tabla = crearTablaAleatoria(10, 1, 100)
mayor = encontrarMayor(tabla)
imprimir("Tabla: ", tabla, " - Mayor valor: ", mayor)
## 3.3. Solución:
#### En este ejercicio he creado tres clases para implementar los principios SOLID: "AnalisisMayor","CreadorTablas" y "Analizador"
#### La clase "AnalisisMayor" contiene un constructor además de un getter de la variable mayor. 
#### La clase "CreadorTablas" contiene un constructor que recibe por parámetros tres enterosy el método crearTabla(), que crea un array de enteros con valores aleatorios entre los dos enteros dados.
#### La clase "Analizador" contiene el main de la clase, donde se crea una tabla aleatoria entre 1 y 100 y nos dice cual es el número mayor de la tabla creada. 
#### Se adjunta UML del ejercicio.

# 5. EJERCICIO 5
## 5.1. Enunciado:
Implementar un algoritmo para crear arte ASCII.
Iniciar con un lienzo vacío y ofrecer un menú para dibujar caracteres, rectángulos y cambiar colores.
Utilizar procedimientos para cada acción.
## 5.2. Pseudocódigo:
procedimiento dibujarCarácter(lienzo, posición, carácter):
# Lógica para dibujar un carácter

procedimiento dibujarRectángulo(lienzo, esquina1, esquina2, carácter):
# Lógica para dibujar un rectángulo

procedimiento cambiarColor(lienzo, posición, nuevoCarácter):
# Lógica para cambiar el carácter

algoritmo principal:
lienzo = crearLienzo(10, 40)
opción = mostrarMenú()
mientras opción ≠ salir:
ejecutarAcción(lienzo, opción)
mostrarLienzo(lienzo)
opción = mostrarMenú()
## 5.3. Solución:
#### Se crean 4 clases: "Lienzo", "Menu","DibujarRectangulo" y "Apliacion"
#### La clase "Lienzo" contiene un constructor que recibe por parámetros dos enteros y un array de caracteres, además de los getters y setters de los atributos.
#### La clase "Menu" contiene un constructor que recibe por parámetros un array de caracteres y un método mostrarMenu() que muestra el menú de la aplicación.
#### La clase "DibujarRectangulo" contiene un constructor que recibe por parámetros dos enteros y un método dibujarRectangulo() que dibuja un rectángulo en el lienzo.
#### La clase "Aplicacion" contiene el método main de la aplicación, donde se crea un lienzo de 10 y se le pide al usuario que indique como quiere dibujar el rectángulo. 

Ayudas: CHAT-GPT y GitHub Copilot.

