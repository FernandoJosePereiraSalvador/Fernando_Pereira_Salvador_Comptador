# Tipo de proyecto

Es un proyecto de una aplicación Android desarrollada en Kotlin. La estructura de directorios y los archivos que se muestran son 
característicos de un proyecto de Android Studio. La construcción y gestión del proyecto se lleva a cabo utilizando la herramienta de construcción llamada Gradle.

# Estructura del proyecto
El proyecto está organizado de la siguiente manera:
1. __.gradle:__ Esta carpeta contiene información relacionada con la construcción del proyecto y sus dependencias. Aquí se almacenan archivos que son parte del sistema de compilación Gradle.
2. __.idea:__ Esta carpeta contiene configuraciones específicas del proyecto para Android Studio, el entorno de desarrollo integrado (IDE) utilizado para desarrollar aplicaciones Android.
3. __app:__ Esta carpeta es la principal y contiene la lógica de la aplicación Android. Aquí es donde se desarrolla el código fuente, los recursos y las configuraciones de la aplicación.
    * __build:__ Contiene archivos generados durante el proceso de compilación, como archivos de recursos compilados y archivos dex, que son archivos compilados del código fuente.
    * __src:__ Aquí es donde se encuentra el código fuente de la aplicación. Los directorios "main," "androidTest," y "test" corresponden a diferentes tipos de código y pruebas en la aplicación.
        * __main:__ Contiene el código fuente principal de la aplicación, incluyendo actividades, fragmentos y otros componentes.
        * __androidTest:__ Contiene las pruebas de instrumentación para la aplicación. Estas pruebas se ejecutan en un dispositivo o emulador Android.
        * __test:__ Contiene las pruebas unitarias de la aplicación. Estas pruebas verifican el comportamiento de las funciones y clases de la aplicación de forma aislada.
    * __res:__ Contiene recursos de la aplicación, como diseños de interfaz de usuario, imágenes y archivos de recursos que se utilizan en la interfaz de la aplicación.
4. __gradle:__ Contiene archivos relacionados con la construcción del proyecto, como scripts de construcción y configuraciones. Gradle es una herramienta de automatización de construcción utilizada para compilar y construir proyectos Android.

# Archivos y carpetas importantes
* __build.gradle:__ Este archivo se encuentra en la raíz del proyecto y contiene la configuración de compilación del proyecto. Aquí se especifican las dependencias, las versiones de Android y otras configuraciones importantes para la construcción.
* __app/build.gradle:__ Este archivo contiene la configuración de construcción específica de la aplicación, como las dependencias y las versiones de Android. Es donde se configura cómo se compilará y construirá la aplicación.
* __app/src/main:__ Esta carpeta contiene el código fuente principal de la aplicación, incluyendo actividades, fragmentos y otros componentes esenciales de la aplicación.
* __app/src/main/res:__ Aquí se encuentran los recursos de la aplicación, como diseños XML para la interfaz de usuario, imágenes utilizadas en la aplicación y archivos de valores que pueden contener cadenas de texto y otros valores constantes.
* __app/src/main/AndroidManifest.xml:__ Este archivo define la configuración de la aplicación, como los permisos requeridos, las actividades principales y otros metadatos importantes para Android.
* __app/src/androidTest:__ Esta carpeta contiene pruebas de instrumentación que se ejecutan en un dispositivo o emulador Android para verificar el funcionamiento de la aplicación en un entorno real.
* __app/src/test:__ Contiene pruebas unitarias que se utilizan para probar componentes de la aplicación de forma aislada, sin necesidad de un dispositivo o emulador Android.
* __app/src/main/pmdm/comptador/MainActivity.kt__: Este archivo generalmente contiene el código fuente de la actividad principal de la aplicación. La actividad principal es la pantalla inicial que se muestra al usuario cuando abre la aplicación.
* __app/src/test/java/pmdm/comptador/ExampleUnitTest.kt:__ Este archivo es un ejemplo de una clase de prueba unitaria. Contiene pruebas que verifican el comportamiento de funciones y clases específicas de la aplicación de forma aislada, sin necesidad de ejecutar la aplicación en un dispositivo o emulador.
* __app/src/main/res/values/strings.xml:__ Este archivo XML contiene cadenas de texto utilizadas en la aplicación. Separar las cadenas de texto en este archivo facilita la internacionalización y la gestión de los textos de la interfaz de usuario.
* __app/src/main/res/layout/activity_main.xml:__ Este archivo XML define el diseño de la interfaz de usuario de la actividad principal 
