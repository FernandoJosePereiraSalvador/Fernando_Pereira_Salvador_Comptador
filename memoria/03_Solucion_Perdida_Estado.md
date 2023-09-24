[Volver al índice](https://github.com/FernandoJosePereiraSalvador/Comptador/tree/main#readme)

# Solución

Para solucionar la pérdida de estado, nos tenemos que asegurar de que los datos que necesitamos conservar en nuestra actividad se guarden y se restauren correctamente cuando lo necesitemos. Para esto podemos usar el método onSaveInstanceState() para guardar datos y el método onRestoreInstanceState() para restaurarlos.

Aqui crearemos los dos métodos (usaremos override para sustituir el método base):
```
    // Guardar el estado de la actividad
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("comptador", comptador)
    }

    // Restaurar el estado de la actividad
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        comptador = savedInstanceState.getInt("comptador", 0)
    }
```

1. __onSaveInstanceState:__ En este método guardaremos el estado de nuestra actividad. Primero llamaremos al método de la clase base y después guardamos nuestra variable "comptador" en un bundle con la clave "comptador" (Un objeto Bundle es una estructura de datos en Android que se utiliza para almacenar y pasar datos en formato clave-valor) 
2. __onRestoreInstanceState:__ En este método restauraremos el estado de nuestra actividad Primero llamaremos al método onRestoreInstanceState para restaurar el estadoy después recuperamos el contenido de la variable "comptador". Si la variable "comptador" esta vacía establecera un 0 como valor.


Después tendremos que agregar este código al principio de nuestro programa en el método oncreate, justo después de usar setContentView para establecer el contenido de la actividad Esto comprobara si ya tenemos una instancia, para eso comprobaremos que no sea null y si es así, es que tenemos una por lo que llamaremos a nuestro método para restaurar el estado.

Aqui esta el código:
```
if (savedInstanceState != null) {
            comptador = savedInstanceState.getInt("comptador", 0)
        }
```
