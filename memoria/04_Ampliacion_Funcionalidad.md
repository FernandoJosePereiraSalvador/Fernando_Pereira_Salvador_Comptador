[Volver al índice](https://github.com/FernandoJosePereiraSalvador/Comptador/tree/main#readme)

# Ampliación funcionalidad

Ahora veremos como hemos agregado los botones para restar y resetear en el contador.

1. __Añadir los botones al Diseño Visual:__ En primer lugar, se realizaron las modificaciones necesarias en el archivo 'activity_main.xml' ubicado en la carpeta 'res/layout/'. para incorporar los botones de resta y reinicio al diseño de la interfaz de usuario. El código correspondiente a estos botones es el de los apuntes. Aunque, se eliminó una línea que presentaba un error: `app:layout_constraintStart_toEndtOf="@+id/btReset`, pero esto no ha alterado el funcionamiento. 

Este es el código final del archivo activity_main.xml:
```
   <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

        <TextView
            android:id="@+id/textViewComptador"
            android:layout_width="338dp"
            android:layout_height="276dp"
            android:fontFamily="sans-serif-black"
            android:textAlignment="center"
            android:textSize="178sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.255" />

        <Button
            android:id="@+id/btResta"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="-"
            android:textSize="34sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toStartOf="@+id/btReset"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/textViewComptador" />

        <Button
            android:id="@+id/btReset"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="0"
            android:textSize="34sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toStartOf="@+id/btAdd"
            app:layout_constraintStart_toEndOf="@+id/btResta"
            app:layout_constraintTop_toBottomOf="@+id/textViewComptador" />

        <Button
            android:id="@+id/btAdd"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="+"
            android:textSize="34sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toEndOf="@+id/btReset"
            app:layout_constraintTop_toBottomOf="@+id/textViewComptador" />

</androidx.constraintlayout.widget.ConstraintLayout>
   ```
2. Para habilitar la interacción con los botones recién agregados en la interfaz de usuario, se procedió a crear referencias a estos botones en el código de la actividad principal. Esto se logró mediante la asignación de variables a los botones mediante el uso de la función findViewById y llamando al ID correspondiente
```
val btReset = findViewById<Button>(R.id.btReset)
        val btResta = findViewById<Button>(R.id.btResta)
```
3. Se asocia una expresión lambda como respuesta al evento Clic sobre el botón. Usamos setOnClickListener para que cuando el usuario haga clic al botón ejecute la función. En el caso de resetear se asigna 0 a "comptador" y en el caso de restar si el comptador es mayor que 0 se le resta 1 (para que no aparezcan números negativos) y después de ambas se actualiza el texto del textViewContador
```
        btResta.setOnClickListener {
            if (comptador > 0){
                comptador--
            }
            textViewContador.text = comptador.toString()
        }

        btReset.setOnClickListener {
            comptador = 0
            textViewContador.text = comptador.toString()
        }
```

# Funcionamiento
Después de haber seguido los pasos anteriores solo tenemos que ejecutar nuestra aplicación y podremos ver el resultado:

<p align="center">
  <img src="https://github.com/FernandoJosePereiraSalvador/Comptador/blob/main/memoria/imagenes/04/contador.PNG" alt="Error">
</p>
