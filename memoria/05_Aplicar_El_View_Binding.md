[Volver al índice](https://github.com/FernandoJosePereiraSalvador/Comptador/tree/main#readme)

# ¿Qué es?
Es una tecnología desarrollada por Google que permite vincular componentes XML con variables en el código de la aplicación. Esto facilita el acceso a las vistas y permite que las vistas reaccionen de manera dinámica a los cambios en los datos. A diferencia de Data Binding, que mezcla el código de presentación XML con el código de la aplicación, View Binding es más sencillo de usar y no requiere modificaciones en los archivos XML, lo que lo hace menos invasivo.

# Pasos para implementarlo
A continuación se muestran los pasos que se han seguido para implementarlo:
1. __Activar el ViewBinding a les buildFeatures del script gradle de nuestro módulo.__
   Para ello hemos modificado el archivo build.gradle.kts y hemos agregado las siguientes líneas de código:
   ```
   buildFeatures {
        viewBinding = true
    }
   ```
2. __Sincronizar el proyecto con este script, para que se generen las clases de vinculación__
   
     Para ello una vez que realizemos algún cambio en el fichero nos aparecera este mensaje en la parte superior donde tendremos que hacer clic sobre: "Sync now":

      <p align="center">
     <img src="https://github.com/FernandoJosePereiraSalvador/Comptador/blob/main/memoria/imagenes/05/sync.PNG" alt="Error">
     </p
  

3. __Importar la clase de vinculación en el fichero de la clase que vamos a usar.__
   
  Para ello hemos usado la siguiente linea de importacion: `import com.ieseljust.pmdm.comptador.databinding.ActivityMainBinding`

4. __Declarar el objeto (binding) que accedera a esta clase__
   
   Para ello lo hemos creado en el MainActivity.kt en el onCreate. Para ello hemos usado esta línea: `binding = ActivityMainBinding.inflate(layoutInflater)`. Esto crea una conexión entre la interfaz de usuario (definida en activity_main.xml) y la lógica de programación en MainActivity.kt al convertir el diseño XML en una estructura de datos accesible desde el código.

5. __Modificar el SetContentView para añadirlo a la raíz del binding__

   Para esto solo tenemos que cambiar la linea de código del SetContentView y añadirle el binding.root que hemos creado en el paso anterior: `setContentView(binding.root)` Esto establece el contenido visual de la pantalla en la raíz del diseño definido en binding, lo que significa que muestra la interfaz de usuario creada a partir del archivo XML en la actividad actual de la aplicación.

6. __Acceder a los elementos de la interficie a traves de este objeto de vinculación__

   Por último tendremos que cambiar todas las partes de nuestro programa que anteriormente usaban Data Binding.

   Aqui estan la referencia de los botones:
   ```
   val btAdd = binding.btAdd
        val btReset = binding.btReset
        val btResta = binding.btResta
   ```
   Y aquí una de las expresiones lambda de nuestros botones:
   ```
   btResta.setOnClickListener {
            if (comptador > 0){
                comptador--
            }
            binding.textViewComptador.text = comptador.toString()
        }
   ```
   
