<<<<<<< HEAD
#Tarea 6 TÉCNICAS DE PROGRAMACIÓN

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
## 2.3. Solución:

# 3. EJERCICIO 3
## 3.1. Enunciado:
## 3.2. Pseudocódigo:
## 3.3. Solución:

# 4. EJERCICIO 4
## 4.1. Enunciado:
## 4.2. Pseudocódigo:
## 4.3. Solución:

# 5. EJERCICIO 5
## 5.1. Enunciado:
## 5.2. Pseudocódigo:
## 5.3. Solución:


