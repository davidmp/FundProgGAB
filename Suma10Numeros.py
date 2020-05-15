contador=1
suma_numeros=0
while(contador<=10):
    numero=int(input(f"Ingrese el valor de la Posicion {contador} :"))
    suma_numeros=suma_numeros+numero
    contador=contador+1    
print(f"La suma de los 10 numeros es: {suma_numeros}")