# Ciclo de vida
El ciclo de vida es un conjunto de estados por los que pasa una actividad desde su creación hasta su destrucción. Estos estados son gestionados por el sistema operativo Android y permiten que la aplicación responda adecuadamente a los eventos y a la interacción del usuario.

# Fases
El ciclo de vida tiene varios estados:
1. __onCreate():__ Este es el primer estado en el que se encuentra una actividad. Se llama cuando la actividad se crea por primera vez. En este estado, se realiza la inicialización básica, como la inflación de la interfaz de usuario y la configuración de las vistas.
2. __onStart():__ En este estado, la actividad se vuelve visible para el usuario, pero aún no está en primer plano. Puede estar oculta parcialmente por otras actividades.
3. __onResume():__ La actividad entra en este estado cuando se convierte en la actividad principal en primer plano y es completamente interactiva.
4. __onPause():__ Cuando la actividad se superpone con otra actividad(por ejemplo, una llamada telefónica, entra en el estado de pausa. En este punto, la actividad debe detener cualquier proceso que no sea necesario mientras esté en segundo plano.
5. __onStop():__ La actividad pasa a este estado cuando ya no es visible para el usuario.
6. __onRestart():__ Cuando la actividad está volviendo a comenzar después de haber estado en el estado "detenida", entra en este estado.
7. __onDestroy():__ En este estado, la actividad se está cerrando y se libera de la memoria.

# Implementación
En este ejemplo lo haremos con "onStart" pero se aplica con el resto.

Tendremos que implementar cada método del ciclo de vida.

Primero sobreescribiremos el metodo "onStart" de la clase base Android

Después lo llamamos en "super.onStart()"

Y por último la línea Log.d(...) registra un mensaje en el sistema de registros de Android.
```
override fun onStart() {
        super.onStart()
        // Registro de log en onStart
        Log.d(TAG, "onStart")
    }
```

# Ejecución
Para ver los registros de los ciclos de vida que hemos hecho iremos a la parte de abajo del IDE y haremos click en "Logcat" y en filtro pondremos el TAG que hemos creado.

Aqui esta el ejemplo de nuestro TAG:
```
companion object {
        private const val TAG = "MainActivity"
    }
```

Aqui tenemos imagenes del resultado de los registros:

# Problema de la pérdida de estado
La pérdida de estado en Android es un problema que ocurre cuando una actividad se destruye y recrea, lo que puede llevar a la pérdida de datos y estado de la aplicación. Esto sucede, por ejemplo, cuando el sistema Android necesita liberar recursos. Para resolver este problema, podemos usar métodos como onSaveInstanceState() y onRestoreInstanceState() para guardar y restaurar el estado de la actividad cuando sea necesario.

Aqui tenemos una imagen del problema:
